package webkdh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("정수 입력하세요 --->");
		
		try {
			int num = sc.nextInt();
			System.out.println("입력한 수 : " + num);
			result = 3 / num;
			System.out.println("result : " + result);
		
		} 
		catch (InputMismatchException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("정수를입력해씨빨련아");
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("0은 내가 인식을 모대");
		} 
		catch (Exception e) { // 모든 예외의 최고 조상인 Exception : 모든 예외처리가능
			// 예외상황마다 다ㅡㄹ기ㅔ 예외처리를 하고자 한다면
			// Exception 블럭은 가장 마지막에 써야한다
			System.out.println("공습경보 공습경보");
		} finally { // try 블럭에서 예외가 발생하든 안하든 마지막에 수해오딜 블럭 (생략 가능)
			System.out.println("빠날리 끝");
		}
		System.out.println("완죠니 끝");

		// --------------------------------------
		
		System.out.print("정수 입력하세요 --->");
		
		sc.close();
		
	}

}
