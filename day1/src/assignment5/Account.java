package assignment5;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public synchronized void addAmount(double amount) {
		this.balance += amount;
	}
	public synchronized void subtractAmount(double amount) throws InsufficientBalance {
		try {
			if(this.balance < amount) {
				throw new InsufficientBalance();
			}else {
				this.balance -= amount;
			}
		} catch(InsufficientBalance e) {
			e.getStackTrace();
		}
	}
}
