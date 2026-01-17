package assignment2;

public class ques2_BookStoreApp {
	public static void main(String[] args) {
		BookStore store = new BookStore();

        // Add sample books (assuming BookStore has an addBook method or uses order)
        store.order("ISBN001", 5);   // new book
        store.order("ISBN002", 3);   // new book

        System.out.println("\nInitial Inventory:");
        store.display();

        // Order existing book
        System.out.println("\nOrdering more copies of ISBN001...");
        store.order("ISBN001", 2);
        store.display();

        // Sell books
        System.out.println("\nSelling 4 copies of Book 1...");
        store.sell("Book Title 1", 4);
        store.display();

        // Attempt to sell more than available
        System.out.println("\nAttempting to sell more copies than available...");
        store.sell("Book Title 1", 10);

        // Attempt to sell a non-existing book
        System.out.println("\nAttempting to sell a non-existing book...");
        store.sell("Unknown Book", 1);

        // Order a completely new book
        System.out.println("\nOrdering a new book...");
        store.order("ISBN003", 6);
        store.display();
	}
}
