
public class Product {
	
	// p. 217 
	// Pojo (Plain Old Java Object, Business Class, or Java Bean)
	// 1) create instance variables
	// 2) generate / create constructor(s)
	// 3) generate / create getter/setters
	// 4) Optional: toString()
	
	private String code;
	private String description;
	private double price;
	
	// default / empty constructor
	public Product() {
		// by default Java sets primitive numeric types 
		// to 0 and String types to null.
	}

	//fully loaded constructor
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
