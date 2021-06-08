import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll the Dice? (y/n): ");
		String choice = "y";
		System.out.println();
		
		
		while (choice.equalsIgnoreCase("y")) {
			int nbr = getRandomInt(6);
			System.out.print("Die 1: "+ nbr);
			int die1 = sc.nextInt();
			System.out.print ("Die 2: "+ nbr);
			int die2 = sc.nextInt();
			System.out.print("Total: " + (die1 + die2));
			int total = sc.nextInt();
			
		System.out.println();
		System.out.print("Roll Again? (y/n): ");
		choice = sc.next();
		System.out.println();
			
	}
		
		sc.close();
		System.out.println();
		System.out.println("Good Bye");
	}

	private static int getRandomInt(int limit) {
		int die1 = (int) (Math.random() * 6);
		int randomInt = (int) die1;
		return randomInt;
		
			
			
			
			
		}
		
		

	}
