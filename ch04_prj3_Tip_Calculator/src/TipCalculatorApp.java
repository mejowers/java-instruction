import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Cost of meal: ");
			BigDecimal cost = new BigDecimal(sc.next());
			System.out.println();

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percentFmtr = NumberFormat.getPercentInstance();
			NumberFormat moneyFmtr = NumberFormat.getCurrencyInstance();

			for (double percent = 0.15; percent <= 0.25; percent += 0.05) {

				// calculate tip and total
				BigDecimal tip = new BigDecimal(Double.toString(percent));
				BigDecimal amount = cost.multiply(tip);
				BigDecimal total = cost.add(amount);

				// display tip and total
				System.out.println(percentFmtr.format(percent));
				System.out.println("Tip amount:    " + moneyFmtr.format(amount));
				System.out.println("Total amount:  " + moneyFmtr.format(total));
				System.out.println();
			}

			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}

		System.out.println();
		sc.close();
		System.out.println("Good Bye");

	}

}
