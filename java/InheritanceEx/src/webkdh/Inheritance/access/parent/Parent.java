package webkdh.Inheritance.access.parent;

public class Parent {
	public int publicVal;
	protected int protectedVal;
	int defaultVal;
	private int provateVal;
	
	public void publicMethod() {
		System.out.println("Parent publicMethod()");
	}
	
	public void protectedMethod() {
		System.out.println("Parent protectedMethod");
	}
	
	void defaultMethod() {
		System.out.println("Parent defaultMethod");
	}
	
	private void privateMethod() {
		System.out.println("Parent privateMethod");
	}
	public void displayParent() {
		System.out.println("Parent : publicVal");
		System.out.println("Parent : protectedVal");
		System.out.println("Parent : defaultVal");
		System.out.println("Parent : provateVal");
	}

	public void sing() {
		
		
	}
}
