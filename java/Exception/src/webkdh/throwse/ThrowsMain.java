package webkdh.throwse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) {
		System.out.println("숫자 입력 ---->");
		int num = 0;
		while (true) {
			
		try {
			num = getPositiveNumber();
		} catch (InputMismatchException e) {
			System.out.println("숫자아니야");
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없더");
		} 
	}
	}

	private static int getPositiveNumber() throws InputMismatchException, NumberFormatException{ // 짬처리
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt(); // 예외발생
		
		sc.nextLine();
		int tmep2 = Integer.parseInt("3.131413"); // NumberFormatException 발생
		return temp;
	}
}
