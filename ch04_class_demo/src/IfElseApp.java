import java.util.Scanner;

public class IfElseApp {

	public static void main(String[] args) {
		// Prompt User for purchase price
		//Calculate total including shipping ($5)
		//Free shipping if purchase price is > 50 or a prime member
		
		System.out.println("Welcome to our shopping app!");
		Scanner sc = new Scanner(System.in);
		
		
		final double SHIPPING = 5;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Purchase price: ");
			double purchasePrice = sc.nextDouble();
			
			System.out.print("Prime? (true/false) ");
			boolean prime = sc.nextBoolean();
			
			if (purchasePrice < 50) {
				if (!prime) {
					purchasePrice += SHIPPING;
				}
			}
			
			System.out.println("Total:  "+purchasePrice);
				
			System.out.print("Continue (y/n)?");
			choice = sc.next();
		}
		
		
		
		
		sc.close();
		System.out.println("Good Bye!");

	}

}
