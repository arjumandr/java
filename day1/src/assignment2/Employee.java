package assignment2;

public abstract class Employee implements Payable{
	private String name;
	private int employeeID;
	public Employee(String name, int employeeID) {
		super();
		this.name = name;
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public abstract void getPayment();
}
