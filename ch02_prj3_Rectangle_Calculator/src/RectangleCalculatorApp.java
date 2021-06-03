import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator!");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.println();
			System.out.print("Enter Length: ");
			double length = sc.nextDouble();
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();

			double area = length * width;
			double perimeter = 2 * length + 2 * width;
			System.out.println();

			System.out.println("Area: " + area);
			System.out.println("Perimiter: " + perimeter);
			
			System.out.print("\nContinue? (y/n) ");
			choice = sc.next();
			System.out.println();
		}

		sc.close();
		System.out.println("Good Bye!");

	}

}
