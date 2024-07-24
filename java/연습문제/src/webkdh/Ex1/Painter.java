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
	
	// 다형성 1번째 법칙 : 부모이름으로 자식이 구현한 (오버라이딩) 메서드를 사용가능
	// 다형성 2번째 법칙 : 부모(product) 이름으로 모든 자식객체를 매개변수로 다 받을 수 있다
	
	public void drawShape(Product product) {
		System.out.println(name + "가 " + product.display() + "인 원을 그립니다.");
		
		// product.getRadius(); 오버라이딩 되지않은 자손의 메서드는 부모타입의 참조변수가 접근불가
		
		if (product instanceof Circle) {
		
		//다운캐스팅
		Circle c = ((Circle) product);
		int r = c.getRadius();
		System.out.println("원의 반지름 : " + r);
		} else if (product instanceof Triangle) {
			Triangle t = (Triangle) product;
			System.out.println("삼각형의 밑변은 : " + t.getBowels());
		} else if (product instanceof Rectangle) {
			Rectangle rect = (Rectangle) product;
			System.out.println("사각형의 밑변은 : " + rect.getWidth());
		}
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
