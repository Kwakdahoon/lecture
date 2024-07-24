package webkdh.Ex2;

public class Buyer{
	private int cA = 1000000; // 현재금액
	private int savePoint; // 포인트
	static final int MAX_ITEMS = 5; // 상수
	Electronic[] Items = new Electronic[MAX_ITEMS]; // 전자제품들 넣는 배열
	int prodCounter = 0;
	
	// 기본생성자
	Buyer () {
		
	}

	
	public void buy(Electronic elec) {
		if (prodCounter >= MAX_ITEMS) {
			System.out.println(MAX_ITEMS + "개 까지만 구매하실 수 있습니다.");
			return;
		}
		
		if (this.cA < elec.getPrice()) {
			System.out.println("잔액 부족....");
			return;
		};
		this.cA -= elec.getPrice();
		this.savePoint += elec.getPoint();
		this.Items[prodCounter++] = elec;
	}


	// 출력하는 메서드(함수)
	public void printItems() {
		int sum = 0;
		System.out.println("구입 목록 리스트");
		
		for (int i = 0; i < prodCounter; i++) {
			sum += Items[i].getPrice();
			System.out.println(Items[i].toString());
			}
		System.out.println("총 금액 : " + sum);
		System.out.println("총 적립금액 : " + this.savePoint);
	}
}
