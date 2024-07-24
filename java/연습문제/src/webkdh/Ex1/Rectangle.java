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
		return super.display() + ", 가로 : " + width + ", 세로 : " + length;
	}
	@Override
	public void draw() {
		System.out.println(this.display() + "인 사각형이 그려집니다.");		
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}


};
