package webkdh.Ex2;

public class Tv extends Electronic{
//	Tv (int price) {
//		super(price);
//	}
	Tv () {
		super(200000);
	}

	@Override
	public String toString() {
		return "Tv [getPrice()=" + getPrice()+"원" + ", getPoint()=" + getPoint() + "점";
	}	
	
}
