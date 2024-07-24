package webkdh.Ex2;


public class ElectronicMain {

	public static void main(String[] args) {
		// 고객(Buyer)이 전자제품 Tv, Monitor, Computer를 구매하려고 한다.
		// 100만원 돈으로 가격이 20만원인 Tv, 10만원인 Monitor, 30만원인 Computer를 구입했다.
		// 구입 가격의 10%를 포인트로 적립받을 수 있다. (포인트 바로 사용 불가)
		// 고객이 구입한 상품 목록과 총 가격, 적립포인트를 출력하세요.
		
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Monitor());
		b.buy(new Computer());
		
		b.printItems();
		
		Tv tv = new Tv();
		Monitor mt = new Monitor();
		Computer cpu = new Computer();
		
		
		
	}
}