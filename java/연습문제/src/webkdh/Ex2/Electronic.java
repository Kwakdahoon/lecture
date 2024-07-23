package webkdh.Ex2;

public class Electronic {


	private int price;
	private double point;
	
	Electronic (int price) {
		this.price = price;
		this.point = price / 10;
	}

	
	// getter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Electronic [price=" + price + ", point=" + point + "]";
	}
}
