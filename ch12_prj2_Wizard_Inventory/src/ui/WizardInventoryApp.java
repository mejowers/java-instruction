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
						+ "grab - Grab an item\n" 
						+ "edit - Edit an item\n"
						+ "drop - Drop an item\n" 
						+ "exit - Exit the program");
		System.out.println();

		List<String> inventory = new ArrayList<>(4);
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String command = Console.getString("Command: ");
			System.out.println();
			if (command.equalsIgnoreCase("show")) {
				for (int i = 0; i < inventory.size(); i++) {
					System.out.println((i + 1) + ". " + inventory.get(i));
				}
			} else if (command.equalsIgnoreCase("grab")) {
				if (inventory.size()>=4) {
					System.out.println("You can't hold anymore inventory. Drop an item first.");
				}else {
				String name = Console.getLine("Name: ");
				inventory.add(name);
				System.out.println(name + " was added to inventory.");
				}
			} else if (command.equalsIgnoreCase("edit")) {
				int number = Console.getInt("Number: ");
				if (number > inventory.size()) {
					System.out.println("Number Invalid.");
				} else {
				String uName = Console.getLine("Updated name: ");
				System.out.println("Item number " + number + " was updated.");
				inventory.set((number - 1), uName);
				}
			} else if (command.equalsIgnoreCase("drop")) {
				int index = Console.getInt("Number: ");
				if (index > inventory.size()) {
					System.out.println("Number Invalid.");
				} else {
				String name = inventory.get(index - 1);
				System.out.println(name + " was dropped from inventory.");
				inventory.remove(index - 1);
				}
			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		System.out.println("Good Bye");

	}

}
