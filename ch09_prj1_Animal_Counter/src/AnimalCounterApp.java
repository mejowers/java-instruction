
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Welcome to the animal counting app!");
		System.out.println();
		
		
		System.out.println("Counting alligators.....");
		System.out.println();
		
		Alligator a = new Alligator();
			count(a,3);
	
		System.out.println("\nCounting sheep.....");
		System.out.println();
		
		Sheep s = new Sheep("Blackie");
		
			count(s,2);
		Sheep s2 = (Sheep)s.clone();
		System.out.println();
		
		
		s2.setName("Dolly");
			count(s2,3);
			System.out.println();
			
			count(s,1);
			System.out.println();
			
		
		 
			
				
		System.out.println("Good Bye!");
		

	}

	public static void count(Countable c, int maxCount) {
		c.resetCount();
		while (c.getCount() <= maxCount) {
		System.out.println(c.getCountString());
		c.incrementCount();
		}
		
	}
}
