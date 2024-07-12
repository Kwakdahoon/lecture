import java.util.Scanner;

public class ArrayEx3Coins {

	public static void main(String[] args) {
//		거스름돈을 몇개의 동전으로 지불할 수 있는지 구하는 프로그램을 작성하세요.
//		예를 들어 거스름돈 money = 2680원 이라고 하면,
//		출력 : 500원짜리 5개, 100원짜리 1개, 50원짜리 1개, 10원짜리 3개
		
		int[] coinUnit = {500,100,50,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거스름돈을 입력하세요 >>>");
		int money= sc.nextInt();
		
		System.out.println("거스름돈 : " + money);
		
		// 2680원
		// 2680 / 500 = 5.... 180
		// 180 / 100 = 1....80
		// 80 / 50 = 1...30
		// 30 / 10 = 3
		
		for (int i =0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 짜리 동전 : " + money / coinUnit[i] + "개");
			money %= coinUnit[i];
		}
		
		

		
		 
		}

}
