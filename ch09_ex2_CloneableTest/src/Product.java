import java.text.NumberFormat;

public class Product implements Cloneable {
	private String code;
	private String description;
	private double price;

	public Product() {
		code = "";
		description = "";
		price = 0;
	}

	public Product(String code, String description, double price) {
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

	@Override
	public String toString() {
		return "Code:          " + code + "\n" + 
	           "Description:   " + description + "\n" + 
			   "Price:         " + this.getFormattedPrice() + "\n";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

}
