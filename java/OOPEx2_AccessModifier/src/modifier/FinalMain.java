package modifier;

public class FinalMain {

	public static void main(String[] args) {
		ConstructInit ci1 = new ConstructInit(10); // 객체 생성
		System.out.println(ci1.value);
		// final 을 필드에 사용할 경우, 생성자를 통해서 한번만 초기화될 수 있다.
//		ci1.value = 20; // The final field ConstructInit.value cannot be assigned
		
		ConstructInit ci2 = new ConstructInit(20);
		System.out.println(ci2.value);
		
		System.out.println("field 초기화................");
		FieldInint fi1 = new FieldInint();
		System.out.println(fi1.value);
		
		FieldInint fi2 = new FieldInint();
		System.out.println(fi2.value);
		
		FieldInint fi3 = new FieldInint();
		System.out.println(fi3.value);
//		fi1.value = 20; 재선언 할 수 없음 새로운 값을 할당 할 수 없음
		
		System.out.println(Math.PI);
		System.out.println(FieldInint.CONST_VALUE);
	}

}
