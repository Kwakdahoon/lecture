package webkdh.Ex1;

public class Product {
	// 멤버변수
	private String name;
	private String color;
	private int x;
	private int y;
	
	// 생성자

	public Product (String name, String color, int x, int y) {
		super();
		this.name = name;
		this.name = color;
		this.x = x;
		this.y = y;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}


	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// 그리는 메서드
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
	// 추상메서드
//	public abstract void draw(); 
	
	public String display() {
		return "Product [name=" + name + ", color=" + color + ", x=" + x + ", y=" + y + "]";
	}
}
