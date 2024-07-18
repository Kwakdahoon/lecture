package modifier;

public class FinalLocalMain {
//	int num1; // 멤버변수 인스턴스 자동으로 0으로 초기화
	public static void main(String[] args) {
		// 지역변수
		int num; // 지역변수는 직접 초기화 해야한다.
		num = 10;
		System.out.println(num); // 10
		num = 20; // final 제어자가 붙은 지역변수는 재할당 못함
		System.out.println(num); // 20
		
		final int num2 = 20; // 재할당 불가능 const같은 상수느낌
//		num2 = 200; //에러
		
		method(10);
		
	}
	// 메서드의 매개변수(파라미터)에 final이 붙으면 메서드 내부에서 매개변수 값을 변경할 수 없다.
	static void method(final int param) {
//		param = 20; // The final local variable param cannot be assigned
	};

}
