package webkdh;

import pet.Cat;
import pet.Dog;

public class PetDc {
	private String name;
	private int age;
	
	PetDc(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 메서드 // 오버로딩
//	public void doCure(Dog d) {
//		System.out.println(d.toString() + " 을 치료합니다");
//	}
//	
//	public void doCure(Cat c) {
//		System.out.println(c.toString() + " 을 치료합니다");
//	}
	
	public void doCure(Pet p) {
		System.out.println(p.toString() + " 을 치료합니다 (다형성)");
	}
	
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	
}
