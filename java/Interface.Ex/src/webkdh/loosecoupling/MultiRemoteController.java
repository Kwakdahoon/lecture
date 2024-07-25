package webkdh.loosecoupling;

public class MultiRemoteController implements Remotable{

	@Override
	public void remoteControl(ElectronicDevice ed) {
		System.out.println(ed.toString() + "제어해");
		ed.powerOn();
	}
	
}
