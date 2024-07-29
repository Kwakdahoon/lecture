package webkdh.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueMain {
	private static int nextNum = 1;
	public static void main(String[] args) {
//		<메뉴>
//		1. 대기번호 발급
//		2. 대기번호 호출
//		9. 종료
//		사용자에게 메뉴를 선택받아서 번호표를 발급하고, 호출하는 기능을 완성하세요
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 번호 발급");
			System.out.println("2 번호 호출");
			System.out.println("9 종료");
			System.out.print("메뉴 선택 ---> ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 :
				numIssuance(queue); // 발급
				break;
			case 2 :
				numCalling(queue);
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
	
	

	public static void numIssuance (Queue queue) { // 번호 발급
		queue.offer(nextNum);
		System.out.println("대기번호 : " + nextNum + "번 발급 완료");
		nextNum++;
	}
	
	public static void numCalling(Queue queue) { // 번호 호출
		if (queue.isEmpty()) { // 문자열의 길이가 0인경우 true return
			System.out.println("노대기 데스");
		} else {
			int cN = (int) queue.poll();
			System.out.println("호출호출 : " + cN + "번 늦지않게 와라");
		}
	}
	
}
