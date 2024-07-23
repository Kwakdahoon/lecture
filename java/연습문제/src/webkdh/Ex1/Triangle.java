package webkdh.Ex1;

public class Triangle extends Product{
	// 부모 Product 클래스에 기본 생성자를 만들지 않은 상태에서 triangel클래스를 만들려고 할 때 에러
	// 해결방법 1) 부모 클래스에 기본 생성자를 만들어 준다.
	// 해결방법 2) 부모클래스가 가지고있는 오버로딩 된 생성자를 이용해서 부모객체가 생성되도록 해야한다.
//	// 삼각형의 고유속성
	private int height;
	private int bowels;
	
//	Triangle(){
//		super();
//	}
	// 생성자
	public Triangle(String name, String color, int x, int y, int height, int bowels) {
		super(name, color, x, y);
//		this();
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
		System.out.println(this.display() + "인 삼각형이 그려집니다.");
	}
	@Override
	public String display() {
		return super.display() + ", 높이 : " + height + ", 가로 : " + bowels;
	}
}
