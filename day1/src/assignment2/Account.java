package assignment2;

public class Account {
	private String name;
	private int accountNumber;
	private double accountBalance;
	public Account(String name, int accountNumber, double accountBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	// no getter for acc num as it never changes once created
	public double getAccountBalance() {
		return accountBalance;
	}
	// no getter for acc balance as we have withdraw and deposit for it
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	public void withdraw(double amount) {
		this.accountBalance -= amount;
	}
}
