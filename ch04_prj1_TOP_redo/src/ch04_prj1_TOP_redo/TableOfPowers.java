package ch04_prj1_TOP_redo;

import com.util.Console;

public class TableOfPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int number = Console.getInt("Enter an integer: ");
			System.out.println();

			System.out.println("Number Squared Cubed");
			System.out.println("====== ======= =====");

			for (int i = 1; i <= number; i++) {
				int squared = (i * i);
				int cubed = (i * i * i);
				System.out.println(i + "\t" + squared + "\t" + cubed);

			}
			System.out.println();
			choice = Console.getLine("Do you want to continue: (y/n)");
		}
		System.out.println();
		System.out.println("Good Bye");

	}

}
