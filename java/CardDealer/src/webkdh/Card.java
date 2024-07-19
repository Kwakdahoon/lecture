package webkdh;

public class Card {
	// 멤버변수
	private int kind; // 카드 모양 (4가지)
	private int number; // 카드 숫자 (1번 ~ 13번)
	
//	private static int width = 100;
//	private static int height = 200;
	
	private static final int HEART = 1;
	private static final int SPADE = 2;
	private static final int CLUB = 3;
	private static final int DIAMOND = 4;
	
	static final int KIND_MAX = 4;
	static final int NUMBER_MAX = 13;
	
	// 생성자
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		// 카드 숫자를 문자열 변환
		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number = this.number + ""; // int -> String
			break;
		}
		
		// 카드 무늬숫자를 특수 문자
		switch (this.kind) {
		case HEART:
			kind = "♥";
			break;
		case SPADE:
			kind = "♠";
			break;
		case CLUB:
			kind = "♣";
			break;
		case DIAMOND:
			kind = "◆";
			break;
		}
		
		return kind + number;
		
	}
	
	
	
}
