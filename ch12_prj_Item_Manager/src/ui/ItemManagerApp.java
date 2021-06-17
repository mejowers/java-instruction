package ui;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Item;

public class ItemManagerApp {
	private static List<Item> items;
	private static final String ITEM_NOT_FOUND_MSG = "Item not found: ";

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Mouse"));

		// implement CRUD functionality to allow a user to
		// maintain the list of items: Create, Read (List, Get by id),
		// Update, and Delete

		System.out.println("Welcome to the Item Manager App!");
		System.out.println();
		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();

			switch (command) {
			case 1:
				System.out.println("Items:");
				System.out.println("=================");
				for (Item i : items) {
					System.out.println(i);
				}
				break;
			case 2:
				System.out.println("Get an Item:");
				System.out.println("=================");
				int number = Console.getInt("Item number to retrieve: ");
				Item item = getItem(number);
				if (item != null) {
					System.out.println();
					System.out.println("* " + item + " *");
				} else {
					System.out.println();
					System.out.println("ITEM_NOT_FOUND_MSG" + number);
				}
				break;
			case 3:
				// add an item
				// - prompt user for number and description
				// - create new instance of item
				// - add item to items list
				// - display success msg (Item added!)
				System.out.println("Add an Item:");
				System.out.println("=================");
				int itemNbr = Console.getInt("Number: ");
				String description = "";
				description = Console.getLine("Description: ");
				items.add(new Item(itemNbr, description));
				System.out.println("Item added!");
				break;
			case 4:
				// update an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				// that matches the number entered
				// - if item not found, print message
				// - if item found, prompt user for new description
				// - change the item description (hint: use setter)
				// and display success msg
				System.out.println("Update an Item:");
				System.out.println("=================");
				number = Console.getInt("Number to update: ");
				Item i = getItem(number);
				if (i != null) {
					description = Console.getLine("New description: ");
					i.setDescription(description);
					System.out.println("Description for " + number + " has been changed to " + description);
				} else {
					System.out.println();
					System.out.println("ITEM_NOT_FOUND_MSG" + number);
				}
				break;
			case 5:
				// delete an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				// that matches the number entered
				// - if item not found, print message
				// - if item found, delete it and display success msg
				System.out.println("Delete an Item:");
				System.out.println("=================");
				number = Console.getInt("Number of item to be deleted: ");
				Item delNbr = getItem(number);
				if (delNbr != null) {
					items.remove(delNbr);
					System.out.println(delNbr + " has been deleted.");
				} else {
					System.out.println();
					System.out.println("ITEM_NOT_FOUND_MSG" + number);
				}
				break;
			case 9:
				// exit
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye!");

	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add new item");
		System.out.println("4 - Update an item");
		System.out.println("5 - Delete an item");
		System.out.println("9 - Exit");
		System.out.println();
	}

	// get an item by number
	// - loop through items and retrieve item
	// that matches the number entered
	// - print the item
	private static Item getItem(int number) {
		Item foundItem = null;
		for (Item item : items) {
			if (item.getNumber() == number) {
				foundItem = item;
			}
		}
		return foundItem;
	}

}
