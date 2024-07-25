package webkdh.loosecoupling;

public class Tv implements ElectronicDevice{
	private String name;
	
	public Tv(String name) {
		this.name = name;
	}
	
	@Override
	public void powerOn() {
		System.out.println(this.name + "켜졁.");
	}

	@Override
	public String toString() {
		return "Tv" + name;
	}
	
}
