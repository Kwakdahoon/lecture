package webkdh.Ex;

public class Main{
	
	public static void main(String[] args) {
		Book book = new Book("다람쥐 대탐험", 50000, "가나다", 15);
		Movie mv = new Movie("다람쥐대소동", 50000, "다람이", "19세이용가");
		Album an = new Album("다람쥐 악단", 100000, "앨빈과 슈퍼밴드");
		System.out.println(book.display());
		System.out.println(mv.display());
		System.out.println(an.display());
		
		int tot = 0;
		
		  Product[] products = {book, mv, an}; // Product 배열에 모든 상품을 저장
	        for (Product product : products) {
	            tot += product.getPrice(); // 총 가격에 각 상품의 가격을 더함
	        }
		System.out.println("총 가격 : " + tot);
	}
}