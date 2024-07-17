package webkdh;

public class CartMain {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		Book book1 = new Book("자바", 20000, 2);
		Book book2 = new Book("JSP", 22000, 3);
		Book book3 = new Book("뿌뿌", 22000, 1);

		book1.displayBook(); // 4
		cart.addBook(book1); // 8
		cart.addBook(book2);
		cart.addBook(book3);
		cart.addBook(book2);
		cart.addBook(book3);
		cart.addBook(book3);
		cart.addBook(book3);
		cart.addBook(book3);
		cart.addBook(book3);
		cart.addBook(book3);
		// 11번째
		cart.addBook(book3);


		cart.displayBooks(); // 장바구니 상품을 출력하고, 전체 가격의 총합을 출력한다.
	}

}
