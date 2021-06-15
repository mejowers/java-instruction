package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
	System.out.println("The Wizard Inventory Game");
	System.out.println();
	
	System.out.println("COMMAND MENU");
	System.out.println("show - Show all items\n"
			+ "grow - Grab an item\n"
			+ "edit - Edit an item\n"
			+ "drop - Drop an item\n"
			+ "exit - Exit the program"); 
	System.out.println();
	
	List<String> inventory = new ArrayList<>();
	inventory.add("wooden staff");
	inventory.add("wizard hat");
	inventory.add("cloth shoes");
	
	
	String choice="y";
	while (choice.equalsIgnoreCase("y")) {
		System.out.println();
		String command = Console.getString("Command: ");
		System.out.println();
				if (command.equalsIgnoreCase("show")) {
					for (int i=0; i<inventory.size(); i++) {
						System.out.println((i+1)+". "+inventory.get(i));
					}
				} else if (command.equalsIgnoreCase("grab")) {
					String name = Console.getLine("Name: ");
					inventory.add(name);
					System.out.println(name+" was added to inventory.");
				}else if (command.equalsIgnoreCase("edit")) {
					int number = Console.getInt("Number: ");
					String uName = Console.getLine("Updated name: ");
					System.out.println("Item number "+number+" was updated.");
							inventory.set((number-1), uName);
				}else if (command.equalsIgnoreCase("drop")) {
					int number = Console.getInt("Number: ");
					inventory.remove(number-1);
					String name = inventory.get(number-1);
					System.out.println(name+" was dropped from inventory.");
				}
			}
	System.out.println("Good Bye");

	}

}
