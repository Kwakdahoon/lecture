
public class DataTypeCasting {

	public static void main(String[] args) {
		// 데이터 타입 형 변환 (cast)
		byte b = 125;
		System.out.println(b);
		
		// 묵시적(자동) 형변환(casting) 프로그래머가 형 변환 연산자를 쓰지 않더라도 자동으로 형 변환.
		// 보통. 작은타입에서 큰 타입으로 변환할 때 묵시적 형 변환이 일어남.
		
		int i = b;
		System.out.println(i);
		
		// int -> float
		float f = 1234;
		float f1 = (float)1234; // 원래 이와같이 형변환이 있어야 하지만, 생략이 된다.
		
		// float -> int
//		int j = 3.14f; // Type mismatch: cannot convert from float to int
		int k = (int)3.14f;
		System.out.println(k);
		
		// int -> byte
		int i2 = 12;
//		byte b2 = i2; Type mismatch: cannot convert from int to byte
		byte b2 = (byte)i2;
		System.out.println(b2);
		byte b3 = 100;
		byte b4 = b3;
		
		// 명시적 형변환 : 프로그래머가 형변환을 하라고 명시해 놓는 것 (큰 타입 -> 작은 타입 변환)
		// (형변환할데이터타입) 캐스팅 할 변수
		// double -> float
		double pi = 3.141592;
		System.out.println(pi);
//		float fpi = pi; Type mismatch: cannot convert from double to float
		float fpi = (float)pi;
		System.out.println(fpi);
		
		// int -> short
		int i3 = 32767;
//		short s = i3; Type mismatch: cannot convert from int to short
		short s = (short)i3;
		System.out.println("s : " + s);
		
		// 문자
		char c = 'a';
		System.out.println("c : " + c);
		System.out.println("c : " + (int)c); // 키코드 값 a : 97
		System.out.println((char)98); // b : 98
		
		// byte -> char 정수에서 문자로
		byte b6 = 97;
		char char2 = (char)b6;
		System.out.println(char2);
		
		byte s4 = 97;
//		char char3 = s4; // cannot convert from byte to char
		
		// boolean
		boolean bool = true;
//		float f2 = (float)bool; // cannot convert from boolean to float
		
		// 연산식에서 자동형변환
		// 리터럴 피연산자인 경우
		byte bsum = 10 + 20;
		
		// 변수가 피연산자인 경우
		byte b7 = 10;
		byte b8 = 20;
//		byte bResult = b7 + b8; //Type mismatch: cannot convert from int to byte 
		byte bResult = (byte) (b7 + b8); 
		System.out.println(bResult);
		int bResult1 = b7 + b8;
		System.out.println(bResult1);
		
		// int 타입과 long 타입 연산
		long l3 = 50;
		int i6 = 60;
//		int result = (int)l3 + i6; //cannot convert from long to int
		int result = (int) (l3 + i6); //cannot convert from long to int
		long result1 = l3 + i6; //cannot convert from long to int
		System.out.println(result + result1);
		
		// 실수 연산
		float f3 = 3.14f + 4.31f;
		System.out.println(f3);
		
//		float f4 = 3.1F + 4.3; // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		float f4 = (float) (3.1F + 4.3);
		double f5 = 3.1F + 4.3;
		
		
		//int, double
		int intNum = 10;
		double dblNum = 3.14;
		double sum1 = (double)intNum + dblNum;
		System.out.println(sum1);
		
		// 정수, 실수를 나누기
		int intNum1 = 1;
		int intNum2 = 2;
		float divNum1 = (float)intNum1 / intNum2;
		System.out.println(divNum1);
		
		// 문자열 변환
		int result3 = 1 + 2 + 3;
		System.out.println("result3 : " + result3);
		
		String result4 = 1 + 2 + ",3";
		System.out.println("result4 : " + result4);
		
		String result5 = 1 + 2 + "2" + 3 + -1;
		System.out.println("result5 : " + result5);
		
		String result6 = "1" + 2 + 3;
		System.out.println("result6 : " + result6);
		
		String result7 = "1," + (2 + 3);
		System.out.println("result7 : " + result7);
		
		String result8 = 4 + "";
		System.out.println("result8 : " + result8);
		
		String result9 = 4 + "" + 3;
		System.out.println("result9 : " + result9);
		
		// 문자열 -> 숫자 (정수형, 실수형)
		int a = Integer.parseInt("1");
		double dlbNum = Double.parseDouble("3.14");
		System.out.println(dlbNum);
		System.out.println(a);
		
		// 숫자 -> 문자열
		String str1 = 3 + "안녕";
		System.out.println(str1);
		
		String str2 = String.valueOf(10);
		System.out.println(str2);
		
		String str3 = String.valueOf(true);
		System.out.println(str3);
	}

}