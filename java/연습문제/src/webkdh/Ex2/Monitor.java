package webkdh.Ex2;

public class Monitor extends Electronic{
	Monitor () {
		super(100000);
	}

	@Override
	public String toString() {
		return "Monitor [getPrice()=" + getPrice()+"원" + ", getPoint()=" + getPoint();
	}
}
