import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Cost of meal: ");
			double cost = sc.nextDouble();
			System.out.println();
			
			for (double rate = 15; rate <30; rate += 5) {
				System.out.println(percent.format(rate/100));
				BigDecimal rate1 = new BigDecimal(rate/100)
						.setScale(2, RoundingMode.HALF_UP);
				System.out.println("Tip Amount:     "+currency.format(cost*(rate/100)));
				System.out.println("Total Amount:   "+currency.format(cost+(cost*(rate/100))));
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
