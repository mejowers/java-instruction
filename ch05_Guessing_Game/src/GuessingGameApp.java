import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		final int LIMIT = 100;

		System.out.println("I am thinking of a number from 1 to " + LIMIT + ".");
		System.out.println("Try to guess it.");
		System.out.println();

		System.out.print("Enter number: ");
		int number = sc.nextInt();

		double d = Math.random() * LIMIT;
		int nbr = (int) d;
		nbr++;
		
		
		
		
		
		
		
		
		
		

		sc.close();
		System.out.println();
		System.out.println("Bye - Come back soon!");

	}

}
