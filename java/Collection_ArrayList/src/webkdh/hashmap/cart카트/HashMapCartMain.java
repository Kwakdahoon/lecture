package webkdh.hashmap.cart카트;

public class HashMapCartMain {
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		cart.addProduct(new Product("자바", 20000), 2);
		cart.addProduct(new Product("오라클", 22000), 1);
		cart.addProduct(new Product("오라클", 22000), 1);
		cart.addProduct(new Product("오라클", 22000), 1);
		cart.addProduct(new Product("오라클", 22000), 1);
		cart.addProduct(new Product("오라클", 22000), 1);
		cart.addProduct(new Product("자바", 20000), 1);
		cart.addProduct(new Product("자바", 20000), 1);
		cart.addProduct(new Product("자바", 20000), 1);
		
		cart.displayCart();
		cart.deleteProd(new Product("오라클", 22000), 1);
		System.out.println("오랄클 삭제");
		cart.displayCart();
	}
}
