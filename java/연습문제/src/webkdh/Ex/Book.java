package webkdh.Ex;

public class Book extends Product {
	private String author;
	private int isbn;
	
	
	public Book(String name, int price, String author, int isbn) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}
	

	@Override
	public String display() {
		return super.display() + " [감독 = " + author + ", 번호=" + isbn + "]";
	}
}