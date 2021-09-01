import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stoplight Choice Console App!");
		System.out.println();
		
		System.out.println("Let's determine the conditions to "
				+ "decide if you should proceed or stop.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("What color is the light (r,g,y)?");
		String color = sc.next();	
		System.out.print("Right turn (true/false)? ");
		Boolean rightTurn = sc.nextBoolean();
		System.out.print("Obstacle (true/false)?");
		Boolean obstacle = sc.nextBoolean();
		System.out.println();
		
		if (color.equalsIgnoreCase("r")) {
			System.out.print("Are you turning right (true/false)? ");
			rightTurn = sc.nextBoolean();}
			if (rightTurn = true) {
			System.out.print("Is there an obstacle (true/false)? ");
			obstacle = sc.nextBoolean();}
			if (obstacle = true) {
				System.out.println("Stop!"); }
			else if (rightTurn = false) {
				System.out.println("Stop!");}
			
				
			else { System.out.println("Proceed!");
			}
			
				
	System.out.print("Again (y/n)?");
	choice = sc.next();
	System.out.println();
	
}
	sc.close();
	System.out.println("Good Bye!");
	
}
}
