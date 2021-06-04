import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the Interest Calculator");
	Scanner sc = new Scanner(System.in);
	System.out.println();
	
	String choice = "y";
	
	while (choice.equalsIgnoreCase("y")) {
		
		
	
		
	
	
	
	
		System.out.println();
		System.out.print("Continue (y/n)?");
		choice = sc.next();
		System.out.println();

	}
	sc.close();
	System.out.println("Good Bye");

}

}