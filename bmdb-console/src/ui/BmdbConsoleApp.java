package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import Interface.DAO;
import business.Actor;
import business.Credit;
import business.Movie;
import db.ActorDB;
import db.CreditDB;
import db.MovieDB;
import text.MovieTextFile;

public class BmdbConsoleApp {
	private static final String ITEM_NOT_FOUND = "No record found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Console - Text file version");
		System.out.println("================================================");
				
		// creating instance of MovieTextFile should create our file
		// on the first time run of this app
		DAO<Movie> moviesDAO = new MovieDB();
		DAO<Actor> actorsDAO = new ActorDB();
		CreditDB creditsDB = new CreditDB();
		
		
		int command = 0;
		while (command !=99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
		switch (command) {
			case 1:
				//get all
				System.out.println("***Get a list of all movies***");
				System.out.println("==============================");
			for (Movie movie: moviesDAO.getAll()) {
					System.out.println(movie);
				}
				break;
			case 2:
			//get by id
				System.out.println("***Get movie by Id***");
				System.out.println("=====================");
				int id = Console.getInt("ID: ");
				Movie movie = moviesDAO.get(id);
				if (movie != null) {
					System.out.println("Movie found: "+movie);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 3:
			//add
				System.out.println("***Add a movie***");
				System.out.println("=================");
				String title = Console.getLine("Title: ");
				String rating = Console.getLine("Rating: ");
				int year = Console.getInt("Year: ");
				String director = Console.getLine("Director: ");
				if (moviesDAO.add(new Movie(title, rating, year, director))) {
					System.out.println("Movie added!");
				} 
				else {
					System.out.println("Error adding movie.");
				}
				break;
			case 4:
			//update
				System.out.println("Update movie");
				System.out.println("============");
				id = Console.getInt("ID: ");
				movie = moviesDAO.get(id);
							
				command = 0;
				while (command !=8) {
					updateMovieMenu();
					command = Console.getInt("Command: ");
					System.out.println();
					
				if (movie != null) {
					switch (command) {
					case 1:
						String newTitle = Console.getLine("New movie title: ");
						movie.setTitle(newTitle);
						break;
					case 2:
						String newRating = Console.getLine("New rating: ");
						movie.setRating(newRating);
						break;
					case 3: 
						int newYear = Console.getInt("New release year: ");
						movie.setYear(newYear);
						break;
					case 4:
						String newDirector = Console.getLine("New director: ");
						movie.setDirector(newDirector);
						break;
					case 8: 
						//finished updating
						break;
					}
					moviesDAO.update(movie);
					System.out.println("Movie information updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				} 
			}break;
			
			case 5:
			//delete
				System.out.println("***Delete a movie***");
				System.out.println("====================");
				id = Console.getInt("ID: ");
				movie = moviesDAO.get(id);
				if (movie != null) {
					moviesDAO.delete(movie);
					System.out.println("Movie Deleted: "+ movie);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 6:
				//get all
				System.out.println("***Get a list of all actors***");
				System.out.println("==============================");
			for (Actor actor: actorsDAO.getAll()) {
					System.out.println(actor);
				}
				break;
			case 7:
			//get by id
				System.out.println("***Get actor by Id***");
				System.out.println("=====================");
				id = Console.getInt("ID: ");
				Actor actor = actorsDAO.get(id);
				if (actor != null) {
					System.out.println("Movie found: "+actor);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 8:
			//add
				System.out.println("***Add an actor***");
				System.out.println("=================");
				String fName = Console.getLine("First name: ");
				String lName = Console.getLine("Last name: ");
				String gender = Console.getString("Gender: ");
				String birthDateStr = Console.getLine("Birth Date (YYYY-MM-DD): ");
				LocalDate bd= LocalDate.parse(birthDateStr);
				if (actorsDAO.add(new Actor(fName, lName, gender, bd))) {
					System.out.println("Actor added!");
				} 
				else {
					System.out.println("Error adding Actor.");
				}
				break;
			case 9:
			//update
				System.out.println("Update actor");
				System.out.println("============");
				id = Console.getInt("ID: ");
				actor = actorsDAO.get(id);
							
				command = 0;
				while (command !=8) {
					updateActorMenu();
					command = Console.getInt("Command: ");
					System.out.println();
					
				if (actor != null) {
					switch (command) {
					case 1:
						String newfName = Console.getLine("New first name: ");
						actor.setfName(newfName);
						break;
					case 2:
						String newlName = Console.getLine("New last name: ");
						actor.setlName(newlName);
						break;
					case 3: 
						String newGender = Console.getString("New gender: ");
						actor.setGender(newGender);
						break;
					case 4:
						birthDateStr = Console.getLine("New birth date (YYYY-MM-DD): ");
						LocalDate newBirthDate= LocalDate.parse(birthDateStr);
						actor.setBirthDate(newBirthDate);
						break;
					case 8: 
						//finished updating
						break;
					}
					actorsDAO.update(actor);
					System.out.println("Movie information updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				} 
			}break;
			
			case 10:
			//delete
				System.out.println("***Delete an Actor***");
				System.out.println("====================");
				id = Console.getInt("ID: ");
				actor = actorsDAO.get(id);
				if (actor != null) {
					actorsDAO.delete(actor);
					System.out.println("Actor Deleted: "+ actor);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 11:
				//get all
				System.out.println("***Get a list of all credits***");
				System.out.println("==============================");
			for (Credit credit: creditsDB.getAll()) {
					System.out.println(credit.getCreditString());
					System.out.println();
				}
				break;
			case 12:
			//get by id
				System.out.println("***Get credit by Id***");
				System.out.println("=====================");
				id = Console.getInt("ID: ");
				Credit credit = creditsDB.get(id);
				if (credit != null) {
					System.out.println("Credit found: "+credit.getCreditString());
					System.out.println();
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
//			case 13:
//			//add
//				System.out.println("***Add Movie credit to an actor***");
//				System.out.println("==================================");
//				String fName = Console.getLine("First name: ");
//				String lName = Console.getLine("Last name: ");
//				String gender = Console.getString("Gender: ");
//				if (actorsDAO.add(new Actor(fName, lName, gender, bd))) {
//					System.out.println("Credit Updated!");
//				} 
//				else {
//					System.out.println("Error adding Credit.");
//				}
//				break;
//			case 14:
//			//update
//				System.out.println("Update actor");
//				System.out.println("============");
//				id = Console.getInt("ID: ");
//				actor = actorsDAO.get(id);
//							
//				command = 0;
//				while (command !=8) {
//					updateActorMenu();
//					command = Console.getInt("Command: ");
//					System.out.println();
//					
//				if (actor != null) {
//					switch (command) {
//					case 1:
//						String newfName = Console.getLine("New first name: ");
//						actor.setfName(newfName);
//						break;
//					case 2:
//						String newlName = Console.getLine("New last name: ");
//						actor.setlName(newlName);
//						break;
//					case 3: 
//						String newGender = Console.getString("New gender: ");
//						actor.setGender(newGender);
//						break;
//					case 4:
//						birthDateStr = Console.getLine("New birth date (YYYY-MM-DD): ");
//						LocalDate newBirthDate= LocalDate.parse(birthDateStr);
//						actor.setBirthDate(newBirthDate);
//						break;
//					case 8: 
//						//finished updating
//						break;
//					}
//					actorsDAO.update(actor);
//					System.out.println("Movie information updated!");
//				}
//				else {
//					System.out.println(ITEM_NOT_FOUND + id);
//				} 
//			}break;
//			
//			case 15:
//			//delete
//				System.out.println("***Delete a credit***");
//				System.out.println("=====================");
//				id = Console.getInt("ID: ");
//				credit = creditsDAO.get(id);
//				if (credit != null) {
//					creditsDAO.delete(credit);
//					System.out.println("Credit Deleted: "+ credit);
//				}
//				else {
//					System.out.println(ITEM_NOT_FOUND + id);
//				}
//				break;
			case 16:
				// pull Credit for a movie
				System.out.println("***List Movie Credits***");
				System.out.println("========================");
				id = Console.getInt("ID: ");
				movie = moviesDAO.get(id);
				if (movie != null) {
					// get all credits for a movie
					// call creditDB.getAllCreditsForMovie, passing the movie
					List<Credit> credits = creditsDB.getCreditsForMovie(movie);
					System.out.println("Movie credits for: "+movie.getTitle()+" Year: "
									+movie.getYear());
					System.out.println();
					for (Credit c: credits) {
						System.out.println(c.getActor().getFullName() + " - " + c.getRole());
					}
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
				
			case 99:
				// exit
				break;
			}
		}		
		System.out.println("Good bye! Thanks for using our movie console.");
	}
	
	private static void displayMenu() {
		System.out.println();
		System.out.println("***Command Menu***");
		System.out.println("==================");
		System.out.println("1 - Get all movies");
		System.out.println("2 - Get a movie");
		System.out.println("3 - Add an movie.");
		System.out.println("4 - Edit movie");		
		System.out.println("5 - Delete a movie");
		System.out.println("------------------");
		System.out.println("6 - Get all actors");
		System.out.println("7 - Get an actor");
		System.out.println("8 - Add an actor");
		System.out.println("9 - Edit an actor");
		System.out.println("10 - Delete an actor");
		System.out.println("--------------------");
		System.out.println("11 - Get all credits");
		System.out.println("12 - Get a credit by Id");
		System.out.println("16 - List movie credits");
		System.out.println("99 - Exit");
		System.out.println();
	
	}
	private static void updateMovieMenu() {
			System.out.println();
			System.out.println("***Update Movie Menu***");
			System.out.println("=================");
			System.out.println("1 - New title");
			System.out.println("2 - New rating");
			System.out.println("3 - New release year");
			System.out.println("4 - New director");	
			System.out.println("8 - Finished updating movie");
			System.out.println();
		}
	
	private static void updateActorMenu() {
		System.out.println();
		System.out.println("***Update Actor Menu***");
		System.out.println("=======================");
		System.out.println("1 - New first name");
		System.out.println("2 - New last name");
		System.out.println("3 - New gender");
		System.out.println("4 - New birth date");	
		System.out.println("8 - Finished updating actor");
		System.out.println();
	}


}

