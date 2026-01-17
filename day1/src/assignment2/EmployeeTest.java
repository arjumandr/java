package assignment2;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {

        // Create ArrayList of Employee (polymorphism)
        ArrayList<Employee> employees = new ArrayList<>();

        // Add different types of employees
        employees.add(new SalariedEmployee("Alice", 101, 1500));
        employees.add(new HourlyEmployee("Bob", 102, 40, 25));
        employees.add(new CommissionEmployee("Charlie", 103, 50000, 10));

        // Display weekly payments
        System.out.println("Weekly Employee Payments:\n");

        for (Employee emp : employees) {
            System.out.println(
                "Employee ID: " + emp.getEmployeeID() +
                ", Name: " + emp.getName()
            );
            emp.getPayment();
        }
    }
}

