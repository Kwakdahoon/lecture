package webkdh.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WaitMain {
	private static final int MAX_WATI_NUM = 10;
	private static int issuedNum = 0;
	
	public static void main(String[] args) {
		Queue<Integer> waitList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
			while (true) {
			System.out.println("1 번호 발급");
			System.out.println("2 번호 호출");
			System.out.println("9 종료");
			System.out.print("메뉴 선택 ---> ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 :
				issueWaitNumber(waitList); // 발급
				break;
			case 2 :
				callWaitNumber(waitList);
				break;
			case 9:
				System.out.println("사요나라");
				sc.close();
				return;
				default :
				System.out.println("1, 2중에 선택을 해주세요 하기싫으면 9번을 누르세요");
			}
		}
	}

	private static void issueWaitNumber(Queue<Integer> waitList) { // 발급
		if (issuedNum >= MAX_WATI_NUM) {
			System.out.println("금일 대기번호 발급 초과....");
			return;
		}
		issuedNum++;
		waitList.offer(issuedNum);
		System.out.println("대기번호 : " + issuedNum + "번 발급 완뇨");
		
	}

	private static void callWaitNumber(Queue<Integer> waitList) {
		
		if (waitList.isEmpty()) {
			System.out.println("대기번호 없습니다람쥐랄");
		} else {
			System.out.println("대기번호 : " + waitList.poll() + "번 호출");
		}
	}
}

