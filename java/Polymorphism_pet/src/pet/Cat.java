package pet;

import webkdh.Pet;

public class Cat extends Pet{

	
	public Cat() {
		super();
	}
	
	public Cat(String name, String variety, int age) {
		super(name, variety, age);
//		this();

	}

	@Override
	public void doCry() {
		System.out.println("냥냥");
	}
	
	public void doJump() {
		System.out.println(this.getName() + "(이)가 점프한다");
	}
	
	public void doScratch() {
		System.out.println(this.getName() + "(이)가 스껄");
	}

	@Override
	public String toString() {
		return "고양이"+ super.toString() ;
	}
}
