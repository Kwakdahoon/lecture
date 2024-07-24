package webkdh.polymorph.instof;

class 윤수혁 {
	
}

class 윤수지 extends 윤수혁 {
	
}
public class InstanceOfMain {

	public static void main(String[] args) {
		윤수혁 윤수혁1 = new 윤수혁();
		윤수지 윤수지1 = new 윤수지();
		
		// 윤수혁 ref = new 윤수혁();
		System.out.println("윤수혁1 instanceof 윤수혁 : " + (윤수혁1 instanceof 윤수혁)); // 진실
		
		// 윤수혁 poly = new 윤수지(); // 다형성
		System.out.println("윤수지1 instanceof 윤수혁 : " + (윤수지1 instanceof 윤수혁)); // 진실
		
		// 윤수지 ref = new 윤수혁() ;
		System.out.println("윤수혁1 instanceof 윤수지 : " + (윤수혁1 instanceof 윤수지)); // 거짓

		// 윤수지 poly = new 
		System.out.println("윤수지1 instanceof 윤수지 : " + (윤수지1 instanceof 윤수지)); // 진실
	}

}
