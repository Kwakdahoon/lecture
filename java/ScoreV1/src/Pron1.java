import java.util.Scanner;

public class Pron1 {

	public static void main(String[] args) {

	// 유저에게 숫자를 입력받아서, 짝수인지 홀수인지 출력하는 프로그램을 만드세요
	Scanner scn = new Scanner(System.in);
	System.out.println("정수만 입력하세요 ->");
	float ranNum = scn.nextFloat();
	
	System.out.println
	(ranNum % 2 == 0 ? "입력하신 숫자는 짝수입니다" : "입력하신 숫자는 홀수입니다.");
	}

}
