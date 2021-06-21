package ui;

import com.util.Console;

import business.Item;
import db.ItemDB;
import interfaces.DAO;
import text.ItemTextFile;

public class ItemManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Item Manager - Text file version");
				
		// creating instance of ItemTextFile should create our file
		// on the first time run of this app
		DAO<Item> itemsDAO = new ItemDB();
		
		int command = 0;
		while (command !=9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
		switch (command) {
			case 1:
				//get all
				System.out.println("Get all items.");
				System.out.println("========================");
				for (Item item: itemsDAO.getAll()) {
					System.out.println(item);
				}
				break;
			case 2:
			//get by id
				System.out.println("Get item by Id");
				System.out.println("========================");
				int id = Console.getInt("ID: ");
				Item item = itemsDAO.get(id);
				if (item != null) {
					System.out.println("Item found: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 3:
			//add
				System.out.println("Add an item");
				System.out.println("========================");
				id = Console.getInt("ID: ");
				String desc = Console.getLine("Description: ");
				if (itemsDAO.add(new Item(id, desc))) {
					System.out.println("Item added!");
				} 
				else {
					System.out.println("Error adding item.");
				}
				break;
			case 4:
			//update
				System.out.println("Update item");
				System.out.println("========================");
				id = Console.getInt("ID: ");
				item = itemsDAO.get(id);
				if (item != null) {
					String newDesc = Console.getLine("New Description: ");
					item.setDescription(newDesc);
					itemsDAO.update(item);
					System.out.println("Item update!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 5:
			//delete
				System.out.println("Delete an item");
				System.out.println("========================");
				id = Console.getInt("ID: ");
				item = itemsDAO.get(id);
				if (item != null) {
					itemsDAO.delete(item);
					System.out.println("Item Deleted: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 9:
				// exit
				break;
			}
		}		
		
		
		
		System.out.println("Good bye!");

	}
	
	private static void displayMenu() {
		System.out.println();
		System.out.println("Command Menu:");
		System.out.println("========================");
		System.out.println("1 - Get all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add an item");
		System.out.println("4 - Edit a file");
		System.out.println("5 - Delete a file");
		System.out.println("9 - Exit");
		System.out.println();
	}

}
