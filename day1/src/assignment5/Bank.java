package assignment5;

public class Bank implements Runnable {
	private Account account;
	
	public Bank(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				account.subtractAmount(1000);
				System.out.println("Bank deducted rupees" + 1000);
			} catch (InsufficientBalance e) {
				e.printStackTrace();
			}
		}
	}

}
