package assignment2;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee(String name, int employeeID, double weeklySalary) {
		super(name, employeeID);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void getPayment() {
		System.out.println("Paid Rupees: "+this.weeklySalary+" every week.");
	}

}
