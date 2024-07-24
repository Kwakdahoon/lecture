package webkdh.Ex2;

public class Electronic {
	private int price;
	private int point;
	public Electronic(int price){
		super();
		this.price = price;
		this.point = (int) (price / 10f);
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "Electronic [price=" + price + ", point=" + point + "]";
	}
	
}
