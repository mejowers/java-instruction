import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App!");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String fName = Console.getString("First Name: ");
			String lName = Console.getString("Last Name: ");
			String email = Console.getString("Email: ");
			String phone = Console.getString("Phone: ");
			System.out.println();

			System.out.println("-------------------------------------------");
			System.out.println("-------------Current Contact---------------");
			System.out.println("-------------------------------------------");
			System.out.println();

			System.out.println("Name:          " + fName + " " + lName);
			System.out.println("Email Address: " + email);
			System.out.println("Phone Number:  " + phone);
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println();

			System.out.print("Continue? (y/n): ");
			choice = sc.next();

		}
		sc.close();
		System.out.println();
		System.out.println("Good Bye!");
	}

}
