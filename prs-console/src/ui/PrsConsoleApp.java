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
			case 3:
				// add user
				System.out.println("***Add user***");
				System.out.println("--------------");
				String userName = Console.getString("Username: ");
				String password = Console.getString("Password: ");
				String firstName = Console.getLine("First name: ");
				String lastName = Console.getLine("Last name: ");
				String phone = Console.getString("Phone: ");
				String email = Console.getString("Email: ");
				boolean reviewer = Console.getString("Reviewer (true/false): ", false) != null;
				boolean admin = Console.getString("Admin (true/false): ", false) != null;
				if (usersDAO.add(new User(userName, password, firstName, lastName,
						phone, email, (boolean)reviewer, (boolean)admin))) {
					System.out.println();
					System.out.println("User added!");
				} else {
					System.out.println("Error adding user!");
				}
				break;
			case 4:
				//edit a user
				break;
			case 5:
				//delete a user
				System.out.println("***Delete a user***");
				System.out.println("-------------------");
				id = Console.getInt("ID: ");
				user = usersDAO.get(id);
				if (user != null) {
					usersDAO.delete(user);
					System.out.println();
					System.out.println("User deleted!");
				}else 
				{System.out.println("Unable to delete user.");
			}
				break;
			case 9: 
				//exit
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
		System.out.println("4 - Edit a user - not functional at this time");
		System.out.println("5 - Delete a user");
		System.out.println("9 - Exit");
		System.out.println();
		
	}
	
}
