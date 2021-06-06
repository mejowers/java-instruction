import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter an Integer that's greater than 0 and less than 10: ");
			int number = sc.nextInt();
			System.out.println();
			
			if (number > 0 && number <= 1) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1) +".");
				System.out.println();
			} else if (number > 1 && number <= 2) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2) +".");
				System.out.println();
			} else if (number > 2 && number <= 3) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3) +".");
				System.out.println();
			} else if (number > 3 && number <= 4) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4) +".");
				System.out.println();
			} else if (number > 4 && number <= 5) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4*5) +".");
				System.out.println();
			} else if (number > 5 && number <= 6) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4*5*6) +".");
				System.out.println();
			} else if (number > 6 && number <= 7) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4*5*6*7) +".");
				System.out.println();
			} else if (number > 7 && number <= 8) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4*5*6*7*8) +".");
				System.out.println();
			} else if (number > 8 && number <= 9) {
				System.out.println("The factorial of "+number+" "+ "is "+ (1*2*3*4*5*6*7*8*9) +".");
				System.out.println();
			} else 	
			
			

			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}

		sc.close();
		System.out.println("Good Bye");
	}

}
