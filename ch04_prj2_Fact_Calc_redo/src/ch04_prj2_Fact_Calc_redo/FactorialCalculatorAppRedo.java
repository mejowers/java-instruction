package ch04_prj2_Fact_Calc_redo;

import com.util.Console;

public class FactorialCalculatorAppRedo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int nbr = Console.getInt("Enter an integer that is greater than 0 and" + " less than 10: ", 0, 10);

			long factorial = 1;
			for (int i = 1; i <= nbr; i++) {
				factorial *= i;
			}
			System.out.println("The factorial for " + nbr + " is " + factorial + "!");

			Console.getLine("Continue? (y/n)");

		}
		System.out.println();
		System.out.println("Good Bye!");

	}
}