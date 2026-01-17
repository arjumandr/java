package assignment2;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private int hourlyRate;
	
	public HourlyEmployee(String name, int employeeID, int hoursWorked, int hourlyRate) {
		super(name, employeeID);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public	void getPayment() {
		System.out.println("Paid rupees: "+ this.hourlyRate*this.hoursWorked + " today.");
	}

}
