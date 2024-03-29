import java.util.Scanner;

public class SwitchApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the menu:");
		System.out.println();

		System.out.println("You're at a crossroads....");
		System.out.println("You can go N, S, E, W...");
		System.out.print("Which way will you go? ");
		
		
		Scanner sc = new Scanner(System.in);
		
		String direction = sc.next();
		System.out.println();
		
		switch (direction) {
		case "N":
		case "n":
			System.out.println("You chose North!");
			break;
		case "S":
		case "s":
			System.out.println("You chose South!");
			break;
		case "E":
		case "e":
			System.out.println("You chose East!");
			break;
		case "W":
		case "w":
			System.out.println("You chose West!");
			break;
		default:
			System.out.println("Invalid direction!");
			break;
		}
		System.out.println();
		sc.close();
		System.out.println("Good Bye!");
	}

}
