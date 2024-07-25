package webkdh.loosecoupling;

public class RemoteMain {

	public static void main(String[] args) {
		Tv tv = new Tv("헬쥐");
		tv.powerOn();
		
		MultiRemoteController mc = new MultiRemoteController();
		mc.remoteControl(tv);
		
		Washer ws = new Washer("똥꼬뿡 ");
		ws.powerOn();
	}

}
