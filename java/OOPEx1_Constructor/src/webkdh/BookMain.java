package webkdh;


public class BookMain {

	public static void main(String[] args) {
		Book01 book1 = new Book01();
		book1.displayBook(); // 책 속성값 출력
		
		Book01 book2 = new Book01("자바", "신용권  외");
		book2.displayBook(); // 책 속성값 출력
		
		Book01 book3 = new Book01("오라클", "이지훈", 23000);
		book3.displayBook(); // 책 속성값 출력
		
		

	}

}
