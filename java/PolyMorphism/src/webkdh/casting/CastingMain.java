package webkdh.casting;

public class CastingMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		// 다운캐스팅 (부모타입 -> 자손타입)
		FireEngine f = (FireEngine) c; // 컴파일은 통과. 런타임오류 발생
		f.water();
		
		Car poly = (Car) new FireEngine(); // 업캐스팅 (자손타입 -> 부모타입)
//		poly.drive();
//		poly.water
		
		// 업캐스팅한 후, 다운캐스팅
		// 다운캐스팅
		FireEngine f2 = (FireEngine) poly;
		f2.water();
		f2.drive();
	}

}
