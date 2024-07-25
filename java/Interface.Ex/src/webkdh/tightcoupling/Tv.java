package webkdh.tightcoupling;

public class Tv {
	private String brandName;
	Tv(String brandName) {
		this.brandName = brandName;
	}
	public void powerOn() {
		System.out.println(this.brandName + "Tv가 켜집니드앍");
	}
}
