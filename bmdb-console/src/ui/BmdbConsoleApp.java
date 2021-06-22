package ui;

import com.util.Console;

import Interface.DAO;
import business.Movie;
import db.MovieDB;
import text.MovieTextFile;

public class BmdbConsoleApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Console - Text file version");
		System.out.println("================================================");
				
		// creating instance of MovieTextFile should create our file
		// on the first time run of this app
		DAO<Movie> moviesDAO = new MovieDB();
		
		int command = 0;
		while (command !=9) {
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
				id = Console.getInt("Id: ");
				String title = Console.getLine("Title: ");
				String rating = Console.getLine("Rating: ");
				int year = Console.getInt("Year: ");
				String director = Console.getLine("Director: ");
				if (moviesDAO.add(new Movie(id, title, rating, year, director))) {
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
					updateMenu();
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
			case 9:
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
		System.out.println("9 - Exit");
		System.out.println();
	
	}
	private static void updateMenu() {
			System.out.println();
			System.out.println("***Update Menu***");
			System.out.println("=================");
			System.out.println("1 - New title");
			System.out.println("2 - New rating");
			System.out.println("3 - New release year");
			System.out.println("4 - New director");	
			System.out.println("8 - Finished updating movie");
			System.out.println();
		}


}

