
public class ProductManagerApp {

	public static void main(String[] args) {
	    System.out.println("Welcome to the Product Manager App");

	    Book b = new Book("Java", "Murach's Java Program", 57.50, "Joel Murach");
	    
	    Software s = new Software("netbeans", "NetBeans", 0, "8.2");
	    
	    System.out.println(b);
	    System.out.println(s);
	    
	    Product p = b;
	    System.out.println("p toString: "+p);
	    
//	    // p. 281 equals method
//	    Product p1 = new Product("andr", "Murach's Adroide", 57.99);
//	    Product p2 = new Product("andr", "Murach's Adroide", 57.99);
//	    
//	    if (p1.equals(p2)) {
//	    	System.out.println("Same book!");
//	    }
//	    else {System.out.println("Different book!");
//	    }
	    	
	    
	    
	    
	    
	    System.out.println("Good Bye!");
	}

}