package webkdh.bingding;

public class BindingMain {
	public static void main(String[] args) {
		Child c = new Child();
//		c.method();
		
		Parent poly = new Child();
		System.out.println("poly.x : " + poly.x); // 20
		System.out.println("c.x : " + c.x); // 10
		poly.method(); // 오버라이딩된 자손의 메서드에 호출 가능
//		poly.Childe(); // 자손만의 메서드는 호출 불가
	}
}
