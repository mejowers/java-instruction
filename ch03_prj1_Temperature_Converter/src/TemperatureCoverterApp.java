import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureCoverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		System.out.println();

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter degrees in Fahrenheit: ");
			double fahrDegrees = sc.nextDouble();

			double celcDegrees = (double) Math.round(((fahrDegrees - 32) * 5 / 9) * 100) / 100;
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			System.out.println("Degrees in Celcius: " + (number.format(celcDegrees)));
			System.out.println();

			System.out.print("Continue (y/n)?");
			choice = sc.next();
			System.out.println();

		}
		sc.close();
		System.out.println("Good Bye");

	}

}
