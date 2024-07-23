package webkdh.Ex1;

public class ShapesMain {

	public static void main(String[] args) {
		// 추상 메서드를 override 한다는 의미는 객체가 분명해졌다는 의미
		// -> 이 객체는 더 이상 Product (추상적이지 않다)
		// 논리적 모순이 생기므로 아래와 같이 쓰지 않는다.
//		Product d = new Product() {
//			
//			@Override
//			public void draw() {
//				System.out.println("draw() 메서드 구현 : ");
//			}
//		};
//		d.draw();
		Triangle triangle = new Triangle("삼각형", "빨간색", 1, 2, 50, 30);
		triangle.draw();
		
		Rectangle rectangle = new Rectangle("사각형", "검정색", 1, 2, 50, 30);
		rectangle.draw();
				
		Circle circle = new Circle("원각형", "흰색색", 1, 2, 50);
		circle.draw();
		
				
//		System.out.println(triangle.display() + "\n" + "\n" + rectangle.display() + "\n" + "\n" + circle.display());
		
		// painter() 클래스 생성
		Painter picaso = new Painter("피카소");
		picaso.drawShape(new Circle("원각형", "흰색색", 1, 2, 50));
		picaso.drawShape(triangle);
		picaso.drawShape(rectangle);
	}

}
