package webkdh;

public class ItemsMain {

	public static void main(String[] args) {
		int tot = 0;
		Item item1 = new Item();
		
		item1.book = "오라클";
		item1.price = 20000;
		item1.quantity = 1;
		
		System.out.println(item1.book + item1.price + item1.quantity);
		
		Item item2 = new Item();
		
		item2.book = "자바";
		item2.price = 15000;
		item2.quantity = 5;
		
		Item item3 = new Item();
		
		item3.book = "스프링";
		item3.price = 25000;
		item3.quantity = 3;
		
		Item[] items = new Item[3];
		items[0] = item1;
		items[1] = item2;
		items[2] = item3;
		
//		for (int i = 0; i < items.length; i++) {
//			System.out.println("도서명 : " + items[i].book + " 가격 : " + items[i].price + " 갯수 : " + items[i].price);	
//		}
		for (Item it : items) {
			System.out.println("도서명 : " + it.book + " 가격 : " + it.price + " 갯수 : " + it.quantity);
			tot += it.price * it.quantity;
		}
		System.out.println("총 금액 : " + tot);
	}
}
