package ui;

import com.util.Console;

public class BattingStasticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		 int atBat = Console.getInt("Enter number of times at bat: ", 1, 30);
		  		 
		 System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		 
		 int[] atBatResult = new int[atBat];
		 
		 for (int i=0; i<atBat; i++) {
			 int r = Console.getInt("Result for at-bat "+(i+1)+": ", -1, 5);
			 atBatResult[i] = r;
		 }
		 for (int ab: atBatResult) {
			 // if ab > 0 add 1 to abgz
		 }
		 System.out.println();
		 
		 
		 
		 
		}
		
		
		
		
		
		
		System.out.println("Good Bye!");

	}

}
