import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Registration");
		System.out.println();  
		
		Scanner sc = new Scanner(System.in);
		
		// Prompt for input
		String firstName;
		System.out.print("Enter your first name: ");
		firstName = sc.next();
		String lastName;
		System.out.print("Enter your last name: ");
		lastName = sc.next();
		int birthYear;
		System.out.print("Enter year of birth: ");
		birthYear = sc.nextInt();
		System.out.println();
		
		// display results and temporary password
		System.out.println("Welcome "+ firstName + " "  + lastName  + "!" );
		System.out.println("Your registration is complete!");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);
		
		
		sc.close();
		System.out.println("Thank you for your registration!");

	}

}
