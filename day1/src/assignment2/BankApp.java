package assignment2;

public class BankApp {
    public static void main(String[] args) {

        // Create Savings Account
        SavingsAccount savings = new SavingsAccount(
                "Alice",
                1001,
                10000
        );

        // Create Current Account
        CurrentAccount current = new CurrentAccount(
                "Bob",
                2001,
                5000,
                "TL-78945",
                3000
        );

        // ---- Savings Account Tests ----
        System.out.println("Savings Account Tests");

        savings.deposit(2000);
        System.out.println("Balance with interest: " + savings.getBalance()); // should include 5% interest

        savings.withdraw(3000); // valid withdrawal
        System.out.println("Balance after withdrawal (with interest): " + savings.getBalance());

        savings.withdraw(6000); // should fail (min balance rule)

        // ---- Current Account Tests ----
        System.out.println("\nCurrent Account Tests");

        current.deposit(2000);
        System.out.println("Current balance: " + current.getBalance());

        current.withdraw(9000); // valid overdraft usage
        System.out.println("Balance after overdraft withdrawal: " + current.getBalance());

        current.withdraw(2000); // exceeds overdraft limit

        System.out.println("\nFinal Balances");
        System.out.println("Savings Account Balance (with interest): " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
