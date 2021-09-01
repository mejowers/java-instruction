package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the JUnit Tester app");
		BasicCalculations calc = new BasicCalculations();
		
		int square = Console.getInt("Please enter an Integer to Square");
		System.out.println(calc.square(square));
		
		String strCount = Console.getString("Please type a string to figure out the number of character 'a' exists within.");
		System.out.println(calc.countA(strCount));
		
		
		System.out.println("Exiting App");
	}

}