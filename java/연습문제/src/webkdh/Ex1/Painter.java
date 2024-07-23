package webkdh.Ex1;

public class Painter extends Product{
	private String name;
	
	Painter (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// 그림 그리는 메서드
//	public void drawShape(Circle circle) {
//		System.out.println(name + "가" + circle.toString() + "인 원을 그립니다.");
//	}
	
	public void drawShape(Product product) {
		System.out.println(name + "가 " + product.display() + "인 원을 그립니다.");
	}
	
	
	@Override
	public String display() {
		return "Painter [name=" + name + "]";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
