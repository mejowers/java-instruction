import java.util.Scanner;

public class StoplightClassSample {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stoplight Choice Console App!");
		System.out.println();
		
		System.out.println("Answer a few questions determing\n"
		+"what action you should take (Proceed vs Stop).\n");
		
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//proceed will dictate final message: Proceed! or Stop!
			boolean proceed = false;
			
			System.out.print("Light Color (r/y/g)? ");
			String lightColor = sc.next();
			if (lightColor.equalsIgnoreCase("r")) {
				System.out.print("Right turn (true/false)? ");
				boolean rightTurn = sc.nextBoolean();
				if (rightTurn) {
					System.out.print("Obstacle? (true/false) ");
									
					boolean obstacle = sc.nextBoolean();
					System.out.println();
					if (!obstacle) {
						proceed = true;
						System.out.println();
						
					}
				}
			}
			else if (lightColor.equalsIgnoreCase("y")) {
				System.out.print("Yards from light? ");
				int yards = sc.nextInt();
				System.out.println();
				
				if (yards < 30) {
					System.out.print("Obstacle? (true/false) ");
					System.out.println();
					
					boolean obstacle = sc.nextBoolean();
					if (!obstacle) {
						proceed = true;
				}
			}
				
			}
			else if (lightColor.equalsIgnoreCase("g")) {
			
					System.out.print("Obstacle? (true/false)");
					boolean obstacle = sc.nextBoolean();
					System.out.println();
					if (!obstacle) {
						proceed = true;
					}
			}
			else {
				System.out.print("Invalid light color. Try again.");
				continue;
			}
			
			if (proceed) {
				System.out.print("Proceed!");
				System.out.println();
				
			}
			else {
				System.out.print("Stop!");
				System.out.println();
				
			}
			
			System.out.print("Again (y/n)?");
			choice = sc.next();
			System.out.println();
			
			
		}
			sc.close();
			System.out.println("Good Bye!");

	}

}
