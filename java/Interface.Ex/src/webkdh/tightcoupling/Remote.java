package webkdh.tightcoupling;

public class Remote {
	private Tv tv;
	// 생성자
	public Remote() {
		// Tv 객체
		tv = new Tv("천둥벌거숭이 ");
	}
	public void turnOnTv() {
		this.tv.powerOn();
	}
}
