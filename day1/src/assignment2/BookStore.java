package assignment2;
import java.util.Scanner;

public class BookStore {
	private Book[] books;
	private int numOfBooks = 0;
	BookStore(){
		books = new Book[10];
	}
	public void sell(String title, int count) {
		for(int i=0; i<numOfBooks; i++) {
			if(books[i].getBookTitle() == title) {
				int qty = books[i].getNumOfCopies();
				if(qty >= count) {
					books[i].setNumOfCopies(qty-count);
					return;
				}
				else {
					System.out.println("Not enough stock.");
					return;
				}
			}
		}
		System.out.println("Book not found.");
	}
	public void order(String ISBN, int count) {
		for(int i=0; i<numOfBooks; i++) {
			if(books[i].getISBN() == ISBN) {
				books[i].setISBN(ISBN + books[i].getISBN());
				return;
			}
		}
		if(numOfBooks < 10) {
			System.out.println("Enter the Book title and author's name: ");
			Scanner sc = new Scanner(System.in);
			String title = sc.nextLine();
			String author = sc.nextLine();
			Book newBook = new Book(title, author, ISBN, count);
			books[numOfBooks++] = newBook;
		} else {
			System.out.println("Book not foudn and Not enough space for a new book.");
		}
	}
	public void display() {
		for(int i=0; i<numOfBooks; i++) {
			System.out.println(books[i].getBookTitle() + " - " + books[i].getAuthor() + " - " + books[i].getISBN() + " - " + books[i].getNumOfCopies());
		}
	}
}
