package assignment2;

public class Invoice implements Payable{
	private int invoiceId;
	private String itemDescription;
	public int quantity;
	public double privePerUnit;
	public Invoice(int invoiceId, String itemDescription, int quantity, double privePerUnit) {
		super();
		this.invoiceId = invoiceId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.privePerUnit = privePerUnit;
	}
	public void getPayment() {
		System.out.println("Payment made of rupees: "+ this.quantity*this.privePerUnit);
	}
}
