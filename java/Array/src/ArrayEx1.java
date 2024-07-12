import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
//		char [] charArr; // 선언
//		charArr = new char[3]; // 정의(생성)
		
		char[] charArr = new char[3];
		
		// 지역변수는 초기화를 하지 않으면 사용하지 못함
		int a;
//		System.out.println();
		
		int[] scores = new int[3]; // 객체는 자동 초기화된다.[0,0,0]
		System.out.println("scores[3] : " + scores.hashCode()); // [I@2a139a55 <= 타입@주소 (16진수)	
		String[] names = new String[5]; // String타입의 배열은 null로 자동 초기화된다.
		System.out.println(names);
		
		boolean isOk[] = new boolean[2]; // boolean타입의 배열은 false로 자동 초기화
		System.out.println(isOk);
		
		// 배열에 요소에 값 할당
		scores[0] = 45;
		scores[1] = 145;
		scores[2] = 245;
		
		System.out.println(scores[2]);
		
//		scores[4] = 50;
//		System.out.println(scores[4]); 배열의 인덱스 범위를 벗어남
		
		// 배열의 크기를 변경
		// 1. 더 큰 배열을 새로 생성
		// 2. 기존 배열의 내용을 새로운 배열에 복사
		scores = new int[4]; // [0,0,0,0]
		System.out.println("scores[4] : " + scores.hashCode());
		
//		scores = new char[4]; // 초기 배열의 타입(int[])과 다른 타입(char[])으로 할당이 불가하다.
		
		int[] scores2 = {100,20,30,55,23};
		System.out.println(scores2.hashCode());
		
		int[] scores3 = new int[] {10,20,30,40,50};
		System.out.println(Arrays.toString(scores3));
		
		int[] scores4;
		scores4 = new int [] {60,70,80,90,100};
//		scores4 = {100,200,300,400,500};
		System.out.println(Arrays.toString(scores4));
		
		String[] heroes = {"아이언맨","스파이더맨","헐크"};
		// 출력 방법
		for (int i =0; i < heroes.length; i++) {
			System.out.println(heroes[i]);
		}
		
		// 확장 for문 (forEach문)
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (String e : heroes) {
			System.out.println(e);
		}
		
		// 2차원 배열의 선언과 생성
		
		int [][] arr = new int[3][4];
		
		int [][] arr1 = {{1,2,3},{4,5,6}};
		
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int c = 0; c < arr1[i].length; c++) {
				System.out.print(arr1[i][c] + " ");
			}
			System.out.println();
		}
		
		// arr 배열에 1부터 1씩 증가된 값을 요소에 할당
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		}

}
