package webkdh;

public class Book {

// 책이름, 가격, 수량
	private String name; // 1
	private int price;
	private int quantity;
	
	// 생성자
	public Book(String name, int price, int quantity) { // 2
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 메서드
	public String getName() { // 3
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void displayBook() {
//		System.out.println("책이름 : " + this.name + ", 가격 : " + this.price + ", 개수 : " + this.quantity);
	}
	
	public int getTotalPrice() { // 10
		return this.price * this.quantity;
	}
}
