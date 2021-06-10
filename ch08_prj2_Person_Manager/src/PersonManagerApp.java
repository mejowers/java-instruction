import com.util.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager App!");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		String personChoice = Console.getString("Create customer or employee? (c/e) ");
		String getFirstName = Console.getString("First Name: ");
		String getLastName = Console.getString("Last Name: ");
		
		string personChoice = 
		if (personChoice.equalsIgnoreCase("c")) { 
			String customerNumber = Console.getString("Customer Number:");
			 
			
			System.out.println("You entered a new Customer: " );
			
		} else {		
				String ssn = Console.getString("SSN: ");
				
				System.out.println("You entered a new Employee: ");
		}
		
		System.out.println();
		
		choice = Console.getString("Continue (y/n)", "y", "n");
		
		
	    
        System.out.println();
		
		}
		
		
		
		System.out.println("Good Bye!");

	}

}
