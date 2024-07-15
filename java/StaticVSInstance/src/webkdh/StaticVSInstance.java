package webkdh;

public class StaticVSInstance {

	public static void main(String[] args) {
		// 클래스 변수 : 클래스명.변수명
//		System.out.println("카드의 가로는 : " + Card.width + ", 카드의 세로는 : " + Card.height);
		
		Card card1 = new Card(); // 인스턴스 생성
		// 인스턴스 변수 : 참조변수명.속성명
		card1.kind = "Heart"; 
		card1.number = 7;
		
		System.out.println("card1 : 모양 = " + card1.kind + ", card1 : 번호 = " + card1.number);
		
		Card card2 = new Card();
		card2.kind = "Diamond";
		card2.number = 4;
		
		System.out.println("card2 : 모양 = " + card2.kind + ", card2 : 번호 = " + card2.number);
		
		System.out.println(card1.width);
		System.out.println(card2.width);
		
		System.out.println("C1은 크기를 반으로 줄입니다.");
//		card1.width = 50;
//		card1.height = 100;
//		card2.width = 50;
//		card2.height = 100;
		Card.width = 50;
		Card.height = 100;
//		System.out.println("카드의 가로는 : " + Card.width + ", 카드의 세로는 : " + Card.height);
		System.out.println("card1 : 가로 = " + card1.width + ", card1 : 세로 = " + card1.height);
		System.out.println("card2 : 가로 = " + card2.width + ", card2 : 세로 = " + card2.height);
		
	}

}
