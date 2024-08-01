package webkdh.hashmap.cart카트;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<Product ,Integer> cartMap = new HashMap<Product, Integer>();
	
	public void addProduct(Product product, int qty) {
		// 상품 추가
		int cartQty = cartMap.getOrDefault(product, 0);
		cartMap.put(product, cartQty + qty);
	}
	
	public void displayCart() {
		for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
			System.out.println("책 : " + entry.getKey() + ", 수량 " + entry.getValue());
		}
	}

	public void deleteProd(Product product, int qty) {
		int cartQty = cartMap.getOrDefault(product, 0);
		int updateQty = cartQty - qty;
		
		if (updateQty <= 0) {
			cartMap.remove(product);
		} else {
			cartMap.put(product, updateQty);
		}
	}
	
}