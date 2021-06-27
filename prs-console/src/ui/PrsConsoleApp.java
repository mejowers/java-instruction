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
		while (command !=99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
			case 10:
				command = 0;
				while (command !=9) {
					displayUserMenu();
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
				boolean reviewer = Console.getBoolean("Reviewer (y/n): ");
				boolean admin = Console.getBoolean("Admin (y/n); ");
				if (usersDAO.add(new User(userName,password, firstName, lastName, phone, 
						email, reviewer, admin))) {
					System.out.println();
					System.out.println("User added!");
				}
				  else {
					System.out.println("Error adding user!");
				}
				break;
			case 4:
				//edit a user
				System.out.println("Update a user");
				System.out.println("=============");
				id = Console.getInt("ID: ");
				user = usersDAO.get(id);
							
				command = 0;
				while (command !=10) {
					updateUserMenu();
					command = Console.getInt("Command: ");
					System.out.println();
					
				if (user != null) {
					switch (command) {
					case 1:
						String newUserName = Console.getString("Update username: ");
						user.setUserName(newUserName);
						break;
					case 2:
						String newPassword = Console.getString("Update password: ");
						user.setPassword(newPassword);
						break;
					case 3: 
						String newFirstName = Console.getLine("Update first name: ");
						user.setFirstName(newFirstName);
						break;
					case 4:
						String newLastName = Console.getLine("Update last name: ");
						user.setLastName(newLastName);
						break;
					case 5:
						String newPhone = Console.getString("Update phone number: ");
						user.setPhone(newPhone);
						break;
					case 6:
						String newEmail = Console.getString("Update email: ");
						user.setEmail(newEmail);
						break;
					case 7:
						boolean newReviewer = Console.getBoolean("Update reviewer access (y/n): ");
						user.setReviewer(newReviewer);
						break;
					case 8:
						boolean newAdmin = Console.getBoolean("Update admin access (y/n): ");
						user.setAdmin(newAdmin);
						break;
					case 10: 
						//finished updating
						break;
					}
					usersDAO.update(user);
					System.out.println("User information updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				} 
			}break;
				
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
				
				break;
			case 20:
				break;
			case 30:
				break;
			case 40:
				break;
			case 50:
				break;
			
			}
			
		}	
		System.out.println("Thank you for using the PRS console app! Have a great day!");
}

	private static void displayUserMenu() {
		System.out.println();
		System.out.println("****User Command Menu****");
		System.out.println("=========================");
		System.out.println("1 - Get all Users");
		System.out.println("2 - Get a user");
		System.out.println("3 - Add a user");
		System.out.println("4 - Edit a user");
		System.out.println("5 - Delete a user");
		System.out.println("9 - Exit");
		System.out.println();
	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("***Main Command Menu***");
		System.out.println("=======================");
		System.out.println("10 - User Command Menu");
		System.out.println("20 - Product Command Menu");
		System.out.println("30 - Vendor Command Menu");
		System.out.println("40 - Request Command Menu");
		System.out.println("50 - LineItem Command Menu");
		System.out.println("99 - Exit Menu");
		System.out.println();
	}
	private static void updateUserMenu() {
		System.out.println();
		System.out.println("***Update a User Menu***");
		System.out.println("========================");
		System.out.println("1 - Update user name");
		System.out.println("2 - Update password");
		System.out.println("3 - Update first name");
		System.out.println("4 - Update last name");
		System.out.println("5 - Update phone");
		System.out.println("6 - Update email address");
		System.out.println("7 - Update reviewer access");
		System.out.println("8 - Update admin access");
		System.out.println("10 - Finished updating user");
		System.out.println();
	}

}
