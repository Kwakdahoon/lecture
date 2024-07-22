package webkdh.Inheritance.super1;

import webkdh.Inheritance.access.parent.Parent;

class parent {
	int a = 10;
	int b = 100;
	parent () {
		System.out.println("부모 기본 생성자");
	}
	
	void sing() {
		System.out.println("부모가 노래합니다.");
	}
	
}

class Child extends parent {
	int a = 20;
	int c = 200;
	Child () {
		System.out.println("자식 기본 생성자");
	}
	void display () {
		System.out.println("a : " + a);
		System.out.println("this.a : " + this.a); // 자식꺼
		System.out.println("this.a : " + super.a); // 부모꺼 
		System.out.println("b : " + b); // 부모꺼 밖에 없음
		System.out.println("c : " + c); // 내꺼밖에 없음
		super.sing ();
		this.sing();
	}
	
	@Override
	void sing () {
		System.out.println("자식이 노래합니다.");
	}
	
}

public class SuperEx1Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
		child.sing();
		
		Parent parent = new Parent();
		parent.sing();
//		parent.display();
	}

}