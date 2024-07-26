package webkdh.custom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCustom {
	public static void main(String[] args) {
		int num = 0;
	
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
			System.out.print("양수입력 ----> ");
			num = sc.nextInt();
			
			if(num > 0) {
				break;
			} else {
				
			if (num < 0 ) {
				throw new NotPositiveInteger("양수아니다");
			}
			}
				// 
			} catch (NotPositiveInteger e) {
				System.out.println(e.getMessage());
				
				// 문자검열
			} catch (InputMismatchException e) {
				System.out.println("숫자입력하세요");
			}
		}
		System.out.println("입력한 숫자 : " + num);
	} 
}	
