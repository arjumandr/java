package assignment2;

public class CommissionEmployee extends Employee {
	private double commisionRate;
	private double totalSales;
	
	public CommissionEmployee(String name, int employeeID, double commissionRate, double totalSales) {
		super(name, employeeID);
		this.commisionRate = commissionRate;
		this.totalSales = totalSales;
	}

	@Override
	public void getPayment() {
		System.out.println("Paid rupees: " + (this.commisionRate*this.totalSales)/100);
	}

}
