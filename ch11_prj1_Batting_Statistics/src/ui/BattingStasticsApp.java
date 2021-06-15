package ui;

import java.text.NumberFormat;

import com.util.Console;

public class BattingStasticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		 int atBatNbr = Console.getInt("Enter number of times at bat: ", 1, 30);
		 System.out.println();
		 
		 System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		 System.out.println();
		 
		 //atBat results greater than zero
		 int abr=0;
		 //total bases earned
		 int basesEarned=0;
		 
		 int[] atBatResults = new int[atBatNbr];
		  
		 for (int i=0; i<atBatNbr; i++) {
			 int result = Console.getInt("Result for at-bat "+(i+1)+": ", 0, 4);
			 atBatResults[i] = result;
			 if (result > 0) {
				 abr++;
			 }
			 basesEarned += result;
		 }
		 System.out.println();
		 double battingAvg = (double) abr/atBatNbr;
		 double sluggingPct = (double) basesEarned/atBatNbr;
		 
		 NumberFormat nf = NumberFormat.getNumberInstance();
		 nf.setMinimumFractionDigits(3);
		 System.out.println("Batting average: "+nf.format(battingAvg));
		 System.out.println("Slugging percent: "+nf.format(sluggingPct));
		 System.out.println();
			 
			 
			 choice = Console.getString("Another player? (y/n)", "y", "n");
				 
	}
	System.out.println();	
	System.out.println("Good Bye!");

	}

}
