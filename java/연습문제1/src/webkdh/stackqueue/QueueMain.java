package webkdh.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueMain {
	static int sumsum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();

		
		while (true) {
			System.out.println("1. 번호 발급");
			System.out.println("2. 번호 호출");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 ->");
			
			int input = sc.nextInt();
		switch (input) {
		case 1 :
			발급(q);
			break;
		case 2 :
			호출(q);
			break;
		case 9 :
			System.out.println("종료데스");
			sc.close();
			return;
			default :
				System.out.println("1,2,9 만 눌러");
		}
		}
	}
	
	public static void 발급 (Queue<Integer> q) {
		sumsum++;
		q.offer(sumsum);
		System.out.println("발급번호 : " + sumsum + "번 입니다.");
	}
	
	public static void 호출 (Queue<Integer> q) {
		
	
		if (q.isEmpty()) {
			System.out.println("아직은 대기번호 없음 니가 첫번째임 ㅃㄹ 끊으셈");
		} else {
			int 발급번호 = (int) q.poll();
			System.out.println("발급번호 : " + 발급번호 + "번 튀어와라");
		}
	}
}
