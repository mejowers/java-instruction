package ui;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

import com.util.Console;

import business.Reservation;

public class ReservationCalculatorApp extends Reservation {

	public static void main(String[] args) {
		System.out.println("****Reservation Calculator*****");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int arrivalMonth = Console.getInt("Enter the arrival month (1-12): ");
			int arrivalDay = Console.getInt("Enter the arrival day (1-31): ");
			int arrivalYear = Console.getInt("Enter the arrival year: ");
			System.out.println();
			
			int departureMonth = Console.getInt("Enter the departure month (1-12): ");
			int departureDay = Console.getInt("Enter the departure day (1-31): ");
			int departureYear = Console.getInt("Enter the departure year: ");
			System.out.println();
						
						
			
			
			
			
			
			
	   
			
			
			
			
		        
		        
		        
		choice = Console.getString("Continue: (y/n)?", "y", "n"); 
		System.out.println();
		        
		}
		
		
		
		
		
		
		System.out.println("Thank you for using our reservation calculator!");

	}

}
