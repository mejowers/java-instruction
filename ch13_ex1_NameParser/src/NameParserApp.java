

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        String[] words = name.split(" ");
    	for (String word: words) {
    		System.out.println("First name: \n");
    	}
       
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];
        
        System.out.println("First Name: "+firstName);
        System.out.println("Middle Name: "+middleName);
        System.out.println("Last Name: "+lastName);
        
        
    }
}
