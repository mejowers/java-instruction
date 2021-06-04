import java.util.Scanner;

public class TimeTravelerCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Time Travel Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println();
	
		// calculate hours and minutes from total miles and speed
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			int mPerHour = sc.nextInt();
			System.out.println();
			
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			
			 int hours = (int)miles / mPerHour;
			 System.out.println("Hours: "+hours);
			 
			 int minutes = Math.round((int)miles % mPerHour);
			 System.out.println("Minutes: "+minutes);
			 
			
			System.out.println();
			System.out.print("Continue (y/n)?");
			choice = sc.next();
			System.out.println();

		}
		sc.close();
		System.out.println("Good Bye");

	}

}
