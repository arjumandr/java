package assignment4;

import java.util.Arrays;
import java.util.Comparator;

class BookComparator implements Comparator<Book> {

//	@Override
	public int compare(Book b1, Book b2) {
		int titleCmp = b1.getTitle().compareToIgnoreCase(b2.getTitle());
		if (titleCmp != 0)
			return titleCmp;
		return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
	}
}

public class BookCollection {
	private String ownerName;
	private Book[] books;

	public BookCollection(String ownerName, Book[] books) {
		super();
		this.ownerName = ownerName;
		this.books = books;
	}

	public boolean hasBook(Book b) {
		for (Book book : books) {
			if (book.equals(b)) {
				return true;
			}
		}
		return false;
	}

	public void sort() {
		Arrays.sort(books, new BookComparator());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Owner: ").append(ownerName).append("\nBooks:\n");
		for (Book book : books)
			sb.append(book).append("\n");
		return sb.toString();
	}

	public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics", "Raj"),
            new Book("Spring Boot", "Sharma"),
            new Book("Java in Depth", "Mehta")
        };

        BookCollection collection = new BookCollection("Rajeev Gupta", books);
     // Check if "Java in Depth" exists
        Book checkBook = new Book("Java in Depth", "Mehta");
        System.out.println("Contains 'Java in Depth'? " + collection.hasBook(checkBook));

        // Sort the collection
        collection.sort();

        // Print sorted collection
        System.out.println(collection);
	}
}
