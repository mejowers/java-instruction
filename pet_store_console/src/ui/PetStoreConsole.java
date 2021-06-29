package ui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.Pet;
import db.PetDB;
import interfaces.DAO;

public class PetStoreConsole {

	public static void main(String[] args) {

		System.out.println("Welcome to the Pet Store Console!");
		System.out.println("=================================");
		System.out.println();

//		DAO<Pet> petsDAO = new PetDB();
		PetDB petsDb = new PetDB();

		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();

			switch (command) {
			case 1:
				System.out.println("**Complete list of Pets**");
				System.out.println("-------------------------");
				for (Pet pets : petsDb.getAll()) {
					System.out.println(pets);
				}
				break;
			case 2:
				System.out.println("**Pet retrieved by ID**");
				System.out.println("-----------------------");
				int id = Console.getInt("Pet ID: ");
				Pet pet = petsDb.get(id);
				if (pet != null) {
					System.out.println("Pet found!" + "\n"+ pet);
					
				} else
					System.out.println("Pet not found. Try Again.");
				break;
				
				case 3:
					System.out.println("**Pet retrieved by gender**");
					System.out.println("---------------------------");
					String gender = Console.getString("Gender desired (m/f): ", "m","f");
					for (Pet pets : petsDb.get(gender)) {
						System.out.println(pets);
					}
					break;
			case 4:
				System.out.println("****Add a pet****");
				System.out.println("-----------------");
				String type = Console.getLine("Pet Type: ");
				String breed = Console.getLine("Breed: ");
				String name = Console.getLine("Name: ");
				String birthDateStr = Console.getLine("Birth Date (YYYY-MM-DD): ");
				LocalDate birthDate = LocalDate.parse(birthDateStr);
				gender = Console.getString("Gender (m/f): ");
				String disposition = Console.getLine("Pet disposition: ");
				boolean available = Console.getBoolean("Available (y/n): ");
				if (petsDb.add(new Pet(type, breed, name, birthDate, gender, disposition, 
						available))) {
					System.out.println("Pet added!");
				} else {
					System.out.println("Error adding Pet record. Please try again.");
				}
				break;
			case 5:
				System.out.println("Update pet record");
				System.out.println("-----------------");
				id = Console.getInt("ID: ");
				System.out.println();
				pet = petsDb.get(id);
							
				command = 0;
				while (command !=10) {
					updatePetMenu();
					command = Console.getInt("Command: ");
					System.out.println();
					
				if (pet != null) {
					switch (command) {
					case 1:
						String newType = Console.getLine("New type: ");
						pet.setType(newType);
						break;
					case 2:
						String newBreed = Console.getLine("New breed: ");
						pet.setBreed(newBreed);
						break;
					case 3: 
						String newName = Console.getLine("New pet name: ");
						pet.setName(newName);
						break;
					case 4:
						birthDateStr = Console.getLine("Birth Date (YYYY-MM-DD): ");
						birthDate = LocalDate.parse(birthDateStr);
						pet.setBirthDate(birthDate);
						break;
					case 5: 
						String newGender = Console.getString("New gender: ");
						pet.setGender(newGender);
						break;
					case 6:
						String newDisposition = Console.getLine("New disposition: ");
						pet.setDisposition(newDisposition);
						break;
					case 7:
						boolean newAvailable = Console.getBoolean("New availability (y/n): ");
						pet.setAvailable(newAvailable);
						break;
					case 10: 
						break;
					}
					petsDb.update(pet);
					System.out.println("Pet information has been updated! \n");
					
				}
				else {
					System.out.println("Pet requested was unable to be found. Try again.");
				} 
			}break;
			
			case 6:
				System.out.println("**Delete a pet by ID**");
				System.out.println("----------------------");
				id = Console.getInt("Pet ID: ");
				pet = petsDb.get(id);
				if (pet != null) {
					petsDb.delete(pet);
					System.out.println("Pet Deleted! \n" + pet);
				} else {
					System.out.println("Unable to delete pet!");
				}
				break;
			case 99:
				break;
			}
		}
	System.out.println("Good Bye!!! Thank you for using the Pet Store Console!");
}

	private static void displayMenu() {
		System.out.println("****Main Command Menu****");
		System.out.println("=========================");
		System.out.println("1 - List all pets");
		System.out.println("2 - Retrieve a pet by id");
		System.out.println("3 - Retrieve pets by gender (m/f)");
		System.out.println("4 - Add a pet");
		System.out.println("5 - Update pet information");
		System.out.println("6 - Delete a pet");
		System.out.println("99 - Exit Menu");
		System.out.println();
	}
	
	private static void updatePetMenu() {
		System.out.println("****Update Pet Menu****");
		System.out.println("=======================");
		System.out.println("1 - Update Type");
		System.out.println("2 - Update Breed");
		System.out.println("3 - Update Name");
		System.out.println("4 - Update Birth Date");
		System.out.println("5 - Update Gender");
		System.out.println("6 - Update Disposition");
		System.out.println("7 - Update Availibility");
		System.out.println("10 - Exit Update Menu");
		System.out.println();
	}
}
