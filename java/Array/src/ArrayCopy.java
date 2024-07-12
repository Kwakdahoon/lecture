import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		char[] chArr = new char[] {'a','b','c'};
		System.out.println("원본배열 : " + Arrays.toString(chArr));
		
		
		// 원본배열 복사 (deep copy)
		char[] copyChArr = new char[chArr.length]; // 초기화된 상태
		
		int i = 0;
		for (char c : chArr) {
			copyChArr[i++] = c;
		}
		
		
		System.out.println("copyChArr : " + Arrays.toString(copyChArr));
		
		// 원본 배열의 값을 수정
		chArr [1] = 'B';
		System.out.println("ㅡㅡㅡㅡㅡㅡdeep copyㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("변경 후 원본 배열 : " + Arrays.toString(chArr));
		System.out.println("변경 후 사본 배열 : " + Arrays.toString(copyChArr));
		
		copyChArr[2] = 'C';
		System.out.println("ㅡㅡㅡㅡㅡㅡdeep copyㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("사본 변경 후 원본 배열 : " + Arrays.toString(chArr));
		System.out.println("사본 변경 후 사본 배열 : " + Arrays.toString(copyChArr));
		
		System.out.println(chArr == copyChArr); // false
		System.out.println(chArr.hashCode()); // 주소값
		System.out.println(copyChArr.hashCode());
		
		// 얕은복사 (주소값만 카피)
		System.out.println("ㅡㅡㅡㅡㅡㅡshallow copyㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String[] heroes = new String[] {"아이언맨" , "헐크" , "캡틴아메리카NO"};
		
		System.out.println("원본배열 : " + Arrays.toString(heroes));
		
		String[] copyHeroes = heroes;
		System.out.println("사본배열 : " + Arrays.toString(copyHeroes));
		
		heroes[2] = "캡틴아메리카";
		System.out.println("변경 후 원본배열 : " + Arrays.toString(heroes));
		System.out.println("변경 후 사본배열 : " + Arrays.toString(copyHeroes));
		
		copyHeroes[2] = "쉰내리카노";
		System.out.println(copyHeroes == heroes);
		System.out.println("사본 변경 후 원본배열 : " + Arrays.toString(heroes));
		System.out.println("사본 변경 후 사본배열 : " + Arrays.toString(copyHeroes));
		
		// String
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡStringㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String str1 = "대한민국";
		String str2 = "대한민국";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		if(str1 == str2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		// 문자열의 값을 비교할 때는 equals() 메서드를 써야한다.
		if (str1.equals(str2)) {
			System.out.println("값이 같음");
		} else {
			System.out.println("값이 쳐 다름");
		}
		
		String str3 = new String("대한민국");
		String str4 = new String("대한민국");
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		// System.arraycopy()
	}
}
