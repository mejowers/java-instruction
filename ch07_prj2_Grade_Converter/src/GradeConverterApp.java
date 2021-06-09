import java.util.Scanner;

import com.util.Console;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter App!");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int numGrade = Console.getInt("Numeric Grade?", -1, 101);
			Grade g = new Grade(numGrade);

			System.out.println("Letter Grade: " + g.getLetter());

			System.out.println();


			choice = Console.getString("Continue (y/n)", "y", "n");

		}
		sc.close();
		System.out.println();
		System.out.println("Good Bye!");

	}

}
