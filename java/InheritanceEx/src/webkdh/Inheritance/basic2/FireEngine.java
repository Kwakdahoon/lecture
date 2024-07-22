package webkdh.Inheritance.basic2;

public class FireEngine extends Car {
	public void hoseWater() {
		System.out.println("물을 뿌립니다.");
	}
	
	@Override
	public void accelerate() {
		System.out.println("개쳐빠르게");
	}
}
