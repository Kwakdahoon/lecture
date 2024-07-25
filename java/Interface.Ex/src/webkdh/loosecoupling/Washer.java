package webkdh.loosecoupling;

public class Washer implements ElectronicDevice{

	private String name;
	
	Washer(String name){
		this.name = name;
	}
	@Override
	public void powerOn() {
		System.out.println(this.toString() + "파워 온 띠디릭");
	}
	@Override
	public String toString() {
		return name;
	}

}
