package webkdh.Ex1;

public class Circle extends Product{
	private int radius;
	
	public Circle(String name, String color, int x, int y, int radius) {
		super(name, color, x, y);
		this.radius = radius;
		
	}

	@Override
	public String display() {
		return "Circle [radius=" + radius + "] " + "반지름 : " + radius;
	}
	

}
