package webkdh.poker포커;

public class Game {
	
	public static void main(String[] args) {
//		게임 시작
//		딜러 : 카드덱을 랜덤하게 섞는다. 플레이어에게 카드를 5장씩 나눠준다.
//		플레어이 (2명) : 딜러에게 받은 5장의 카드를 정렬된 순서대로 보여준다.
//			정렬 기준
//			- 숫자는 오름차순
//			- 숫자가 같으면 스페이드, 하트, 다이아몬드, 클럽 순서로 정렬
//			
//			승패 기준 : 
//				카드 숫자의 총합이 큰 플레이어가 승리한다.
//				같으면 무승부
		Card card = new Card();
		
		
		System.out.println("카드 숫자 목록 : " + Card.getNumbers().get("numbers"));
		

	}
}
