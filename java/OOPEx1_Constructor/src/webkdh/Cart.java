package webkdh;

import webkdh.Book;

public class Cart {
	// Book배열, 전체수량(Book[]의 요소 갯수)
	// 멤버 변수
	private Book[] books = new Book[10]; // [null, null, ... , null]5
	private int bookCount; // 0
	
	// 생성자 (기본)
	public Cart() { // 6
	}
	
	// 메서드
	public void addBook(Book book) { // 7 , 
		if (bookCount >= books.length) { // 12 10개 이상 담지 못하게
			System.out.println("이제 한계야...... 그만 담아...");
			return; // 14 특정 조건이 만족 될 때 메서드의 실행을 중단.
		} 
//		else {
			
		books[bookCount] = book; // 13 else 문 사용해서 오류 없애기
		bookCount++;
		System.out.println("그만 쳐 담아라. " + bookCount);
//		}
	}
	

	public void displayBooks() { //9
		System.out.println("--장바구니--");
		for (int i = 0; i < bookCount; i++) {
			Book book = books[i];
			System.out.println("상품명 : " + book.getName() + ", 가격 : " + book.getPrice() 
			+ ", 수량 : " + book.getQuantity() + ", 합계 : " + book.getTotalPrice() + "원");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");			
		System.out.println("총 상품수 : " + bookCount + ", 총 가격 : " + calculateTotalPrice() + "원");
	}
	private int calculateTotalPrice() { // 11
		int totalPrice = 0;
		for (int i = 0; i < bookCount; i++) {
			totalPrice += books[i].getTotalPrice();
		}
		return totalPrice;
	}
}
