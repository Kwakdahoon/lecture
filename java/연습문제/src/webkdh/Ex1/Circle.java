package webkdh.Ex1;

public class Circle extends Product{
	private int radius;
	

	public Circle(String name, String color, int x, int y, int radius) {
		super(name, color, x, y);
		this.radius = radius;
	}
	

	public int getRadius () {
		return radius;
	}
	@Override
	public String display() {
		return super.display() + ", 반지름 : " + radius; 
	}


	@Override
	public void draw() {
		System.out.println(this.display() + "인 원각형이 그려집니다.");		
	}
	
	// 오버로딩
	public String display(String str) {
		return str;
	}
}
