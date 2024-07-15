package webkdh;

public class MethodParams1 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("메서드 호출 전 a = : " + a);
		callPrimitiveParam(a);
		System.out.println("메서드 호출 후 a = : " + a);
		
		Data dataA = new Data(); // 참조형 (사용자 정의타입)
		System.out.println(dataA.value); // 0
		dataA.value = 10;
		System.out.println("메서드 호출 전 sex.value = " + dataA.value); // 10
		callPrimitiveParam(dataA.value); // 기본타입을 매개변수로 이용
		System.out.println("메서드 호출 후 sex.value = " + dataA.value); // 20
	}
	
	
	
	static void callPrimitiveParam(int data) {
		data = 20;
		System.out.println(data);
	}
	


}
