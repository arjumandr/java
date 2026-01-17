package assignment2;

public class SavingsAccount extends Account {
	private final int interest = 5;
	private double maxWithdrawLimit = super.getAccountBalance();
	private final double minBalanceAllowed = 5000;
	
	
	public SavingsAccount(String name, int accountNumber, double accountBalance) {
		super(name, accountNumber, accountBalance);
	}

	public double getBalance() {
		return super.getAccountBalance() + (super.getAccountBalance()*interest)/100;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount <= maxWithdrawLimit || super.getAccountBalance()-amount <= maxWithdrawLimit) {
			super.withdraw(amount);
		}else {
			System.out.println("Insufficient balance. Cant withdraw.");
		}
	}
}
