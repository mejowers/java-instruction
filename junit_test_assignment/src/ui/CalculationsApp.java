package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		int nbr = Console.getInt("Number to be squared: ");
		
	System.out.println("Square: " +BasicCalculations.square(nbr));
	
	
	
	
	String line = Console.getLine("Comment: ");
	System.out.println("# of a's: " +BasicCalculations.countA(line));
	
	System.out.println("Good Bye");

	}

}
