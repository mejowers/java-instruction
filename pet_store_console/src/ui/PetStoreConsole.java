package ui;

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
		
		DAO<Pet> petsDAO = new PetDB();
		
		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
				case 1: 
					System.out.println("**Complete list of Pets**");
					System.out.println("-------------------------");
					for (Pet pets: petsDAO.getAll()) {
						System.out.println(pets);						
					}
					break;
				case 2:
					System.out.println("**Pet retrieved by ID**");
					System.out.println("-----------------------");
					int id = Console.getInt("Pet ID: ");
					Pet pet = petsDAO.get(id);
					if (pet != null) {
						System.out.println("Pet found: "+pet);
					}else
						System.out.println("Pet not found. Try Again.");
					break;
//				case 3:
//					System.out.println("**Pet retrieved by gender**");
//					System.out.println("---------------------------");
//					String gender = Console.getString("Gender desired (m/f): ");
//					for () {
//						
//					}
//					break;
				case 4: 
					System.out.println("****Add a pet****");
					System.out.println("-----------------");
					String type = Console.getLine("Pet Type: ");
					String breed = Console.getLine("Breed: ");
					String name = Console.getLine("Name: ");
					String birthDateStr = Console.getLine("Birth Date (YYYY-MM-DD): ");
					LocalDate birthDate = LocalDate.parse(birthDateStr);
					String gender = Console.getString("Gender (m/f): ");
					String disposition = Console.getLine("Pet disposition: ");
					boolean available = Console.getBoolean("Available (y/n): ");
					if (petsDAO.add(new Pet(type, breed, name, birthDate, gender, 
									disposition, available))) {
						System.out.println("Pet added!");
					}else
						System.out.println("Error adding Pet record. Please try again.");
					break;
				case 5:
					break:
				case 6:
					
					
					
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Good Bye!!! Thank you for using the Pet Store Console!");

	}
	
	private static void displayMenu() {
		System.out.println("****Main Command Menu****");
		System.out.println("=========================");
		System.out.println("1 - List all pets");
		System.out.println("2 - Retrieve a pet by id");
		System.out.println("3 - Retrieve pets by gender (M/F)");
		System.out.println("4 - Add a pet");
		System.out.println("5 - Update pet information");
		System.out.println("6 - Delete a pet");
		System.out.println("99 - Exit Menu");
		System.out.println();
				
	}
	

}
