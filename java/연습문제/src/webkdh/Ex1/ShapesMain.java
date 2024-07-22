package webkdh.Ex1;

public class ShapesMain {

	public static void main(String[] args) {
		Triangle triangle = new Triangle("삼각형", "빨간색", 1, 2, 50, 30);
		triangle.draw();
		Rectangle rectangle = new Rectangle("사각형", "검정", 1, 2, 50, 30);
		Circle circle = new Circle("원", "흰색", 1, 2, 50);
		
		
		System.out.println(triangle.display() + "\n" + rectangle.display() + "\n" + circle.display());
	}

}
