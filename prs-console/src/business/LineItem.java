package business;

public class LineItem {
	
	private int id;
	private Request request;
	private Product product;
	private int qty;
	
	public LineItem() {
		super();
	}

	public LineItem(int id, Request request, Product product, int qty) {
		super();
		this.id = id;
		this.request = request;
		this.product = product;
		this.qty = qty;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", request=" + request + ", product=" + product + ", qty=" + qty + "]";
	}
	
	

}
