import java.util.Random;

import com.util.Console;

public class PigDiceGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice Game!");
		System.out.println();

		String choice = "y";
		choice = Console.getLine("Are you ready? (y/n): ");

		while (choice.equalsIgnoreCase("y")) {
			int roll = RollDie();
			if (roll != 1) {
				int count = 0;
				int num = 0;
				System.out.println("Pig: " + roll);
				num = num + roll;
				count++;
			} else roll = 1 {
				System.out.println("Sum: " + num + "\n" + 
									"Total rolls: " + count);
			}
		

//			int count;
//			count++;
//			if (die !=1) {
//				continue;
//			} else System.out.println("Number of rolls: "+count+"\n"
//					+ "Sum of rolls: ");

		}

		System.out.println("Good Bye!");

	}

	private static int RollDie() {
		return (int) (Math.random() * 6) + 1;
	}
}
