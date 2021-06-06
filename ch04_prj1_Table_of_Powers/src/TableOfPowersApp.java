import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an Integer: ");
			int number = sc.nextInt();
			System.out.println();

			System.out.println("Number  Squared  Cubed");
			System.out.println("======  =======  =====");
			System.out.println();

			for (int i = 1; i <= number; i += 1) {
				System.out.println(i + "\t" + (i * i) + "\t" + " " + (i * i * i));
			}

			System.out.println();

			System.out.print("Continue? (y/n): ");
			choice = sc.next();

		}

		sc.close();
		System.out.println();
		System.out.println("Good Bye!");

	}

}
