package assignment2;

import java.util.ArrayList;
import java.util.List;

public class PaymentApp {
	public static void main(String[] args) {
		List<Payable> payments = new ArrayList<>();
		payments.add(new SalariedEmployee("Alice", 101, 1500));
        payments.add(new HourlyEmployee("Bob", 102, 40, 25));
        payments.add(new CommissionEmployee("Charlie", 103, 50000, 10));
        
     // Add Invoices
        payments.add(new Invoice(201, "Laptop", 2, 45000));
        payments.add(new Invoice(202, "Printer", 1, 12000));
        payments.add(new Invoice(203, "Office Chair", 5, 3500));

        // Process all payments uniformly
        System.out.println("Processing Payments:\n");

        for (Payable p : payments) {
            System.out.println("Payment Amount:");
            p.getPayment();
        }
	}
}
