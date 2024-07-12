
public class DataTypesAndVariables {

	public static void main(String[] args) {
		// boolean : true | false (1byte)
		boolean bool = true; // 변수 bool를 선언과 할당
		System.out.println(bool); // println : 줄바꿈 출력, print : 한줄에 출력
		
		// char : 문자형. 2byte. 한 문자를 저장
		char character = 'a';
		System.out.println(character);
		char character2 = '1';
		System.out.println(character2);
		char korChar = '가';
		System.out.println(korChar);
		char character3 = '\u0041'; // 유니코드 A : 0041
		System.out.println(character3);
		
		// byte : 정수형. 1byte
		byte b = 115;
		int s = 16510;
		System.out.println(b);
		System.out.println("Byte타입의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("Byte타입의 최소값 : " + Byte.MIN_VALUE);
		
		byte b1 = (byte)384;
		System.out.println(b1); // - 128 (overflow)
		
		// short
		short kwak = 128;
		System.out.println("곽 : " + kwak);
		System.out.println("Short타입의 최대값 : " + Short.MAX_VALUE);
		System.out.println("Short타입의 최소값 : " + Short.MIN_VALUE);

		// int : 정수형. 4byte
		int da = 35;
		System.out.println("다 : " + da);
		System.out.println("Integer타입의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("Integer타입의 최소값 : " + Integer.MIN_VALUE);
		
		// long : 정수형. 8byte
		long hoon = 35L; // L, l 리터럴 
		System.out.println("훈 : " + hoon);
		System.out.println("Long타입의 최대값 : " + Long.MAX_VALUE);
		System.out.println("Long타입의 최소값 : " + Long.MIN_VALUE);
		
		// float : 실수형. 4byte
		// float kwakda = 3.14; Type mismatch: cannot convert from double to float
		float kwakda = 3.14f;
		System.out.println("곽다 : " + kwakda);
		System.out.println("float타입의 최대값 : " + Float.MAX_VALUE);
		System.out.println("float타입의 최소값 : " + Float.MIN_VALUE);
		
		// double : 실수형. 8byte
		double dahoon = 3.14;
		System.out.println("다훈 : " + dahoon);
		System.out.println("double타입의 최대값 : " + Double.MAX_VALUE);
		System.out.println("double타입의 최소값 : " + Double.MIN_VALUE);
		
		// 문자열 (String) : 참조타입
		// char 리터럴 작은따옴표
		// 두 문자 이상은 문자열로, 큰따옴표 감싼다. - 문자열 리터럴
		
		String str = "대한민국";
		System.out.println(str);
		System.out.println("str의 길이 : " + str.length());
		System.out.println(str.getClass().getName());
		
		String str1 = "";
//		char ch = ''; // 에러 Invalid character constant
	}

}
