package webkdh.Inheritance.superconstructor;


class Parent {
	Parent() {
		System.out.println("부모 생성자 호출");
	}
	Parent (int a) {
		System.out.println("부모 생성자 a : " + a);
	}
}

class Child extends Parent {
//	Child () {
//		System.out.println("자식 생성자 호출");
//	}
	
	Child (int a) {
		super(10); // 기본 생성자 생략 가능
		System.out.println("자식 생성자 a : " + a);
	}
	
	Child (int a, int b) {
		super(10);
		System.out.println("자식 생성자 a : " + a + ", b : " + b);
	}
}

class GrandChild extends Child {
	GrandChild() {
		super(30, 40);
		System.out.println("손자 생성자");
	}
}
public class SuperConstrucMain {

	public static void main(String[] args) {
//		Child child = new Child();
//		Child child1 = new Child(10);
//		Child child2 = new Child(100,200);
		
		GrandChild grandChild = new GrandChild();
	}
	
	

}
