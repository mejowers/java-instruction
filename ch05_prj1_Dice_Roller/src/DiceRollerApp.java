import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = getNextString(sc, "Roll the Dice? (y/n): ");
		
		
		

		while (choice.equalsIgnoreCase("y")) {
			int die1 = rollDie();
			int die2 = rollDie();
			
			printResults(die1, die2);
	
			choice = getNextString(sc, "Roll Again? (y/n): ");
			System.out.println();

		}

		sc.close();
		System.out.println();
		System.out.println("Good Bye");
	}

	private static int rollDie() {
		return (int) (Math.random() * 6) + 1;
		
	}
		
	private static String getNextString(Scanner sc, String prompt) {
			System.out.print(prompt);
			return sc.next();
		}
	
	private static void printResults(int die1, int die2) {
		System.out.println("Die1: "+die1);
		System.out.println("Die2: "+die2);
		int total = die1 + die2;
		System.out.println("Total: "+total);
		if (total == 2) {
			System.out.println("Snake Eyes");
			
		} else if (total == 12) {
			System.out.println("Box Cars");
		}
	}
	
			
			
			
		

}
