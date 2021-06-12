import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); // print a blank line

		// create a Scanner object named sc
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double invoiceTotal = 0.00;
		double discountTotal = 0.00;
		int invoiceCount = 0;

		// perform invoice calculations until choice is equal to "n" or "N"
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			// get the invoice subtotal from the user
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();

			// calculate the discount amount and total
			double discountPercent;
			if (subtotal >= 500) {
				discountPercent = .25;
			} else if (subtotal >= 200) {
				discountPercent = .2;
			} else if (subtotal >= 100) {
				discountPercent = .1;
			} else {
				discountPercent = 0.0;
			}
			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;

			invoiceTotal = invoiceTotal + total;
			discountTotal = discountTotal + discountAmount;
			invoiceCount = invoiceCount + 1;

			// display the discount amount and total
			String message = "Discount percent: " + discountPercent + "\n" 
							+ "Discount amount:  " + discountAmount+ "\n"
							+ "Invoice total:    " + total + "\n";
			System.out.println(message);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		String message = "Number of invoices: " + invoiceCount + "\n" 
				+ "Average Invoice amount: " + invoiceTotal / invoiceCount + "\n" 
				+ "Average discount amount: " + discountTotal / invoiceCount+ "\n";
		System.out.println(message);

	}
}
