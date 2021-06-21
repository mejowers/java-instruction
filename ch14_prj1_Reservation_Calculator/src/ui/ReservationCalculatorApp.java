package ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.util.Console;

import business.Reservation;

public class ReservationCalculatorApp extends Reservation {

	public static void main(String[] args) {
		System.out.println("****Reservation Calculator*****");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Arrival Information:");
			int arrivalYear = Console.getInt("Year: ");
			int arrivalMonth = Console.getInt("Month: ");
			int arrivalDay = Console.getInt("Day: ");
			
			System.out.println();
			System.out.println("Enter Departure Information:");
			int departureYear = Console.getInt("Year: ");
			int departureMonth = Console.getInt("Month: ");
			int departureDay = Console.getInt("Day: ");
			
			
			
			
			
	   
			
			
			
			
		        
		        
		        
		choice = Console.getString("Continue: (y/n)?", "y", "n"); 
		System.out.println();
		        
		}
		
		
		
		
		
		
		System.out.println("Thank you for using our reservation calculator!");

	}

}
