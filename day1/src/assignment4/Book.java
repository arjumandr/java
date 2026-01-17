package assignment4;

public class  Book{
	private String title;
	private String author;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return title+" - "+author;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o==null || getClass() != o.getClass()) return false;
		Book book = (Book)o;
		return title.equals(book.getTitle()) && author.equals(book.author);
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
}
