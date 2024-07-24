package webkdh.Ex2;

public class Computer extends Electronic{
	Computer ( ) {
		super(300000);
	}

	@Override
	public String toString() {
		return "Computer [getPrice()=" + getPrice()+"원" + ", getPoint()=" + getPoint();
	}
}