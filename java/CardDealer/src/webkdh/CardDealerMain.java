package webkdh;

public class CardDealerMain {

	public static void main(String[] args) {
		Dealer 주윤발 = new Dealer(); // 딜러 생성 
		System.out.println("섞기 전 카드: ");
		System.out.println(주윤발.dispalyCard());
		
		주윤발.shuffle();
		System.out.println("섞은 후 카드: ");
		System.out.println(주윤발.dispalyCard());
	
		
//		for (int i = 0; i < Dealer.CARD_NUM; i++) {
//			// 카드를 1장씩 지급
//			Card c = 주윤발.pickCard();
//			System.out.println( (i + 1) + "번째 뽑힌 카드 : " + c.toString());
//			System.out.println(주윤발.dispalyCard());
//		}
		
		for (int i = 0; i < Dealer.CARD_NUM; i++) {
			Card c = 주윤발.pickCardWithRemoveArray();
			System.out.println("뽑은 카드 : " + c.toString());
			System.out.println(주윤발.dispalyCard());
		}
		
	}

}
