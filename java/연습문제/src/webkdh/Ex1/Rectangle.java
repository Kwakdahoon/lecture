package webkdh.Ex1;

public class Rectangle extends Product{
	private int width;
	private int length;
	
	public Rectangle(String name, String color, int x, int y, int width, int length) {
		super(name, color, x, y);
		this.width = width;
		this.length = length;
		
	}
	@Override
	public String display() {
		return "Rectangle [width=" + width + ", length=" + length + "] " + "가로 : " + width + ", 세로 : " + length;
	}


}
