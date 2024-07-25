package webkdh.loosecoupling.factory;

public class NoParser implements Parseable{

	@Override
	public boolean parse() {
		System.out.println("파써없어");
		return false;
	}

}
