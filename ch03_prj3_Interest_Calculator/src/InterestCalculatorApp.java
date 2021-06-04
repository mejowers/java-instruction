import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println();

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter loan amount: ");
			BigDecimal loan = sc.nextBigDecimal();
			System.out.print("Enter the interest: ");
			BigDecimal interest = sc.nextBigDecimal();
			System.out.println();

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
				
//			BigDecimal intAmt = loan.multiply(interest)
//					.setScale(2,RoundingMode.HALF_UP);
			
			BigDecimal intAmt = loan.multiply(interest);
			intAmt=intAmt.setScale(2,RoundingMode.HALF_UP);
			
			System.out.println("Loan amount: " + currency.format(loan));
			System.out.println("Interest rate: " + percent.format(interest));
			System.out.println("Interest amount: "+ currency.format(intAmt));

			System.out.println();
			System.out.print("Continue (y/n)?");
			choice = sc.next();
			System.out.println();

		}
		sc.close();
		System.out.println("Good Bye");

	}

}