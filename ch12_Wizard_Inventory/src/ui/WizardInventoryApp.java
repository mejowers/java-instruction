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
		String command = Console.getString("Command: ");
				if (command.equalsIgnoreCase("show")) {
					System.out.println(inventory);
				} else if (command.equalsIgnoreCase("grab")) {
					String name = Console.getString("Name: ");
					inventory.add(name);
				}
		
		
		
	
	
	}
	System.out.println("Good Bye");

	}

}
