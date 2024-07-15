package webkdh;

import java.util.Arrays;

public class MethodParams2 {

	public static void main(String[] args) {
		Data dataA = new Data();
		System.out.println(dataA.value); // 0
		dataA.value = 10;
		System.out.println("메서드 호출 전 sex.value = " + dataA.value); // 10
		callReferenceParam(dataA); // 참조타입을 매개변수로 이용
		System.out.println("메서드 호출 후 sex.value = " + dataA.value); // 20
		
		int [] aArr = {10}; // 참조타입
		System.out.println(Arrays.toString(aArr));
		changeParam(aArr);
		System.out.println(Arrays.toString(aArr));

	}
	
	static void callReferenceParam(Data sex) {
		sex.value = 20;
		System.out.println(sex.value);
	}
	
	static void changeParam(int[] x) {
		x[0] = 100;
	}
}
