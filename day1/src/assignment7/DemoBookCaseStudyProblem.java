package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

class Author {
    private String name;
    private String lastname;
    private String country;
	public Author(String name, String lastname, String country) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", lastname=" + lastname + ", country=" + country + "]";
	}
    
}

class Book {
    private String title;
    private List<Author> authors;
    private int pages;
    private Subject subject;
    private int year;
    private String isbn;
	public Book(String title, List<Author> authors, int pages, Subject subject, int year, String isbn) {
		super();
		this.title = title;
		this.authors = authors;
		this.pages = pages;
		this.subject = subject;
		this.year = year;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", pages=" + pages + ", subject=" + subject + ", year="
				+ year + ", isbn=" + isbn + "]";
	}
    
}

enum Subject {
    JAVA, DOT_NET, ORACLE;
}

public class DemoBookCaseStudyProblem {
	public static void main(String[] args) {

        List<Book> allBooks = loadAllBooks();

        // 1. Find books with more than 400 pages
        
        System.out.println("Books with more than 400 pages:");
        List<Book> moreThan400 = allBooks.stream().filter(b -> b.getPages() > 400).collect(Collectors.toList());
        System.out.println(moreThan400);
        
        // 2. Find all books that are Java books and more than 400 pages
        
        System.out.println("Java books with more than 400 pages:");
        List<Book> javaMoreThan400 = allBooks.stream().filter(b -> b.getSubject().equals("JAVA") && b.getPages() > 400)
        									 .collect(Collectors.toList());
        System.out.println(javaMoreThan400);
        
        // 3. We need the top three longest books
        
        System.out.println("Top 3 longest books");
        List<Book> threeLongest = allBooks.stream()
        						  .sorted(Comparator.comparingInt(Book::getPages).reversed())
        						  .limit(3)
        						  .collect(Collectors.toList());
        System.out.println(threeLongest);
        
        // 4. We need from the fourth to the last longest books
        
        System.out.println("4th to the last longest books:");
        List<Book> fourth2last = allBooks.stream()
        						 .sorted(Comparator.comparingInt(Book::getPages).reversed())
        						 .skip(3)
        						 .collect(Collectors.toList());
        System.out.println(fourth2last);
        
        // 5. We need to get all the publishing years
        
        System.out.println("All publishing years");
        Set<Integer> allYears = allBooks.stream()
        					  .map(Book::getYear)
        					  .collect(Collectors.toSet());
        System.out.println(allYears);
        
        // 6. We need all the authors' names who have written a book
        
        System.out.println("All author's names");
        Set<List<Author>> allAuthors = allBooks.stream()
        						.map(Book::getAuthors)
        						.collect(Collectors.toSet());
        System.out.println(allAuthors);
        
        // 7. We need all the origin countries of the authors
        
        System.out.println("Origin countries of authors");
        
//        Set<Author> allAuthors = allBooks.stream()
//                .flatMap(book -> book.getAuthors().stream())
//                .collect(Collectors.toSet());

        
        Set<String> originCountries = allBooks.stream()
        							  .flatMap(book -> book.getAuthors().stream())
        							  .map(Author::getCountry)
        							  .collect(Collectors.toSet());
        System.out.println(originCountries);
        
        // 8. We want the most recent published book.
        
        System.out.println("Most recent published book");
        Optional<Book> mostRecentBook = allBooks.stream()
        								.max(Comparator.comparingInt(Book::getYear));
        System.out.println(mostRecentBook);
        
        // 9. We want to know if all the books are written by more than one author
        
        System.out.println("Are all books written by more than one authors?");
        boolean areAllMultipleAuthors = allBooks.stream()
        								.allMatch(b -> b.getAuthors().size()>1);
        System.out.println(areAllMultipleAuthors ? "Yes": "No");
        
        // 10. We want one of the books written by more than one author. (findAny)
        
        System.out.println("Any book written by more than one authors?");
        Optional<Book> anyMultipleAuthors = allBooks.stream()
        								.filter(b -> b.getAuthors().size() > 1)
        								.findAny();
        System.out.println(anyMultipleAuthors);
        
        // 11. We want the total number of pages published.
        
        System.out.println("Total number of pages published.");
        Integer totalPages = allBooks.stream().mapToInt(Book::getPages).sum();
        System.out.println(totalPages);
        
        // 12. We want to know how many pages the longest book has.
        
        System.out.println("Number of pages in the longest book:");
        OptionalInt maxPages = allBooks.stream().mapToInt(Book::getPages).max();
        System.out.println(maxPages);
        
        // 13. We want the average number of pages of the books
        
        System.out.println("Average number of pages of all books:");
        OptionalDouble avgPages = allBooks.stream().mapToInt(Book::getPages).average();
        System.out.println(avgPages);
        
        // 14. We want all the titles of the books
        
        System.out.println("All the titles of the books:");
        Set<String> allTitles = allBooks.stream().map(Book::getTitle)
        								.collect(Collectors.toSet());
        System.out.println(allTitles);
        
        // 15. We want the book with the highest number of authors
        
        System.out.println("Book with the highest number of authors");
        Optional<Book> bookWithMostAuthors = allBooks.stream()
        						   .max(Comparator.comparingInt(b -> b.getAuthors().size()));
        System.out.println(bookWithMostAuthors);
        
        // 16. We want a Map of <year, list of books>
        
        System.out.println("Map of <year, list of books>: ");
        Map<Integer, List<Book>> booksByYear = allBooks.stream()
        										.collect(Collectors.groupingBy(Book::getYear));
        System.out.println(booksByYear);
        
        // 17. We want to count how many books are published per year.
        
        System.out.println("Count of books published per year: ");
        Map<Integer, Long> countBooksPerYear = allBooks.stream()
        											   .collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));
        System.out.println(countBooksPerYear);
    }

    private static List<Book> loadAllBooks() {

        List<Book> books = new ArrayList<Book>();

        List<Author> authors1 = Arrays.asList(
                new Author("raj", "gupta", "in"),
                new Author("ekta", "gupta", "in")
        );

        List<Author> authors2 = Arrays.asList(
                new Author("raj", "gupta", "in")
        );

        List<Author> authors3 = Arrays.asList(
                new Author("gunika", "gupta", "us"),
                new Author("keshav", "gupta", "us")
        );

        books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
        books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
        books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

        return books;
    }
}
