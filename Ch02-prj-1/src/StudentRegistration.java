import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Registration");
		System.out.println();  
		
		Scanner sc = new Scanner(System.in);
		
		// get students first name, last name and birth year
		String firstName;
		System.out.print("Enter your first name: ");
		firstName = sc.next();
		String lastName;
		System.out.println("Enter your last name: ");
		lastName = sc.next();
		int year;
		System.out.println("Enter Birth Year: ");
		year = sc.nextInt();
		
		// display results and temporary password
		System.out.println("Welcome "+ firstName + " "  + lastName  + "!" );
		System.out.println("Your registration is complete!");
		System.out.println();
		System.out.println("Your temporary password is: " + firstName + "*" + year);
		
				
		System.out.println("Thank you for your registration!");

	}

}
