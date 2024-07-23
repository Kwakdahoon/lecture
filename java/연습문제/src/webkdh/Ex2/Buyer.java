package webkdh.Ex2;

public class Buyer{
	private int nowMoney = 1000000;
	private int point;
	static final int SONNOM = 5;
	Electronic cart[] = new Electronic[SONNOM];
	private int electCount; // 갯수
	
	// 특별한 초기화 작업 없이도 인스턴스 생성하기 위함
	Buyer() {
		
	}
	
	// buy 메서드 생성
	// if 문 사용
	 public void buy(Electronic electronic) {
		 if(electCount >= SONNOM) {
			 System.out.println(SONNOM + "개 까지 구매");
			 return;
		 }
		 if (nowMoney <= electronic.getPrice()) {
			 System.out.println("잔액 부족");
			 return;
		 }
		 nowMoney -= electronic.getPrice();
		 point += electronic.getPoint();
		 cart[electCount++] = electronic;
	 }

	// 출력 메서드
	 
	 public void print() {
		 int sum = 0; // 총금액
		 System.out.println("구입 목록 리스트");
		 
		 for (int i = 0; i < electCount; i++) {
			sum += cart[i].getPrice();
			System.out.println(cart[i].toString());
		}
		 System.out.println("총 금액 : " + sum);
		 System.out.println("총 적립금액 : " + point);
	 } 
}
