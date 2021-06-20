import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date

        // Get input from the the user
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and validate user's date of birth
        
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dateOfBirthString);
    	if (birthDate.isAfter(currentDate)) {
			System.out.println("This date isn't here yet. \n");
		}else {
            
        // If user's date of birth is valid
            // Format and print user's date of birth
            System.out.println("Your date of birth is "+getBirthDateFormatted(birthDate));

            // Format and print the current date
            System.out.println("The current date is "+getCurrentDateFormatted(currentDate));;

            // Calculate and print the user's age
        
    			
            long ageYears = ChronoUnit.YEARS.between(birthDate, currentDate);
    		System.out.println("Your age is " + ageYears);
    		}
    }
    public static String getBirthDateFormatted(LocalDate birthDate) {
    	DateTimeFormatter birthDateFmt = DateTimeFormatter.ofLocalizedDate(
    			FormatStyle.MEDIUM);
    	return birthDateFmt.format(birthDate);
    }
    
    public static String getCurrentDateFormatted(LocalDate currentDate) {
    	DateTimeFormatter currentDateFmt = DateTimeFormatter.ofLocalizedDate(
    			FormatStyle.MEDIUM);
    	return currentDateFmt.format(currentDate);
    }
}