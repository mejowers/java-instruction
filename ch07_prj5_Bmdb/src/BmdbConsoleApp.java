
public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bmdb App!");
		System.out.println();
		
		int id = Console.getInt("Id? ");
		String title = Console.getString("Title? ");
		String rating = Console.getString("Rating? ");
		int year = Console.getInt("Year? ", 1800, 9999);
		String director = Console.getString("Director? ");
		System.out.println();
		
		
		Movie m = new Movie(id, title, rating, year, director);
		
		System.out.println("Movie Summary: "+m);
		System.out.println();

	}
	
	

}
