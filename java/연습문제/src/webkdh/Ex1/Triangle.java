package webkdh.Ex1;

public class Triangle extends Product{
	// 삼각형의 고유속성
	private int height;
	private int bowels;
	
	// 생성자
	public Triangle(String name, String color, int x, int y, int height, int bowels) {
		super(name, color, x, y);
		this.height = height;
		this.bowels = bowels;
	}
	


	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int getBowels() {
		return bowels;
	}

	public void setBowels(int bowels) {
		this.bowels = bowels;
	}

	@Override
	public void draw() {
		System.out.println(this.toString() + "인 삼각형이 그려집니다.");
	}
	@Override
	public String display() {
		return super.display() + "Triangle [height=" + height + ", bowels=" + bowels + "]";
	}
}
