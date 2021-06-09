import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter App!");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int numGrade = Console.getInt("Enter a numerical grade: ");

			String ltrGrade = "F";
			if(numGrade>=88){
				ltrGrade = "A";
			}else if(numGrade>=80){
				ltrGrade = "B";
			}else if(numGrade>=68){
				ltrGrade = "C";
			}else if(numGrade>=60){
				ltrGrade = "D";
			} 
			
			System.out.println("Letter grade: "+ltrGrade);
			System.out.println();
			

			System.out.print("Continue? (y/n)");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
		System.out.println("Good Bye!");

	}


}
