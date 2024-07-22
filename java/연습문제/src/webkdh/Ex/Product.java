package webkdh.Ex;

public class Product{
	//멤버 변수
	private String name;
	private int price;
	
	// 생성자
	public Product (String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	// getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String display() {
		return "[이름=" + name + ", 가격=" + price + "]";
	}

}