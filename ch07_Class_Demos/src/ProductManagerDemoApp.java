
public class ProductManagerDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager.");
		System.out.println();
		

	//p. 225
	//create products
		// use empty constructors
		Product p1 = new Product();
		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.5);
		printProduct(p1);
		System.out.println();
		
		
		
		//fully loaded constructor
		Product p2 = new Product("andr", "Murach's Android Programming", 59.50);
		printProduct(p2);
		System.out.println();
	
		
				
		
		
		System.out.println();
		System.out.println("Good Bye.");
	}
	
	private static void printProduct(Product p) {
		System.out.println("Product Detail:");
		System.out.println("Code: "+p.getCode());
		System.out.println("Description: "+p.getDescription());
		System.out.println("Price: "+p.getPrice());	
	}

}
