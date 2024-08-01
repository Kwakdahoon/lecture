package webkdh.hashmap.cart카트;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public  class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name + ", price : " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product temp = (Product) obj;
			if (this.price == temp.price && this.name.equals(temp.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price, name);
	}
}
