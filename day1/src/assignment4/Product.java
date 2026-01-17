package assignment4;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	@Override
	public String toString() {
		return productName + "("+ productPrice +")" + " rupees.";
	}
	
}
