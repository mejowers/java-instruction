package ui;

import com.util.Console;

import business.User;
import db.UserDB;
import interfaces.DAO;

public class PrsConsoleApp {

	private static final String ITEM_NOT_FOUND = "No record found for id.";

	public static void main(String[] args) {

		System.out.println("Welcome to the PRS Console App!");
		System.out.println("===============================");

		DAO<User> usersDAO = new UserDB();
				
		int command = 0;
		while (command !=9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
			case 1: 
				//get all
				System.out.println("***Get a list of all users***");
				System.out.println("-----------------------------");
				for (User user: usersDAO.getAll()) {
					System.out.println(user);
				}
				break;
			case 2: 
				// get by id
				System.out.println("***Get a user by id***");
				System.out.println("----------------------");
				int id = Console.getInt("ID: ");
				User user = usersDAO.get(id);
				if (user != null) {
					System.out.println("User found: "+user);
				} else 
				{System.out.println(ITEM_NOT_FOUND +id);
				}
				break;
			case 9:
				// exit
				break;
				
			}
		}
		
		System.out.println("Thank you for using the PRS console app! Have a great day!");

	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("****Command Menu****");
		System.out.println("====================");
		System.out.println("1 - Get all Users");
		System.out.println("2 - Get a user");
		System.out.println("3 - Add a user");
		System.out.println("4 - Edit a user");
		System.out.println("5 - Delete a user");
		System.out.println("9 - Exit");
		System.out.println();
		
	}
	
}
