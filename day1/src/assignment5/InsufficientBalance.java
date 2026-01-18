package assignment5;

public class InsufficientBalance extends Exception {

	private static final long serialVersionUID = 1L;

	public void InsufficientBalance() {
		System.out.println("Insufficient balance! Cant withdraw amount.");
	}
	
}
