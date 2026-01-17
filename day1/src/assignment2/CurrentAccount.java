package assignment2;

public class CurrentAccount extends Account {
	private String tradeLicenseNumber;
	private double overdraft;
	public CurrentAccount(String name, int accountNumber, double accountBalance, String tradeLicenseNumber, double overdraft) {
		super(name, accountNumber, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
		this.overdraft = overdraft;
	}
	public String getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}
	public double getOverdraft() {
		return overdraft;
	}
	public double getBalance() {
		return super.getAccountBalance();
	}
	public void withdraw(double amount) {
		if(amount <= super.getAccountBalance()+overdraft) {
			super.withdraw(amount);
		}else {
			System.out.println("Withdrawal exceeds overdraft limit.");
		}
	}
}
