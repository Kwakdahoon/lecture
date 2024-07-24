package pet;

import webkdh.Pet;

public class Dog extends Pet{

	public Dog(String name, String variety, int age) {
		super(name, variety, age);
	}

	// 추상적 메서드
	@Override
	public void doCry() {
		System.out.println("멍멍");
	}

	public void doWag() {
		System.out.println(getName() + "이(가) 꼬리 흔들흔들");
	}
	
	@Override
	public String toString() {
		return "강아지" + super.toString();
	}
}