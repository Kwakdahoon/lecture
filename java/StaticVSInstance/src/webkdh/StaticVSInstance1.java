package webkdh;

public class StaticVSInstance1 {
//	static int sInt; // 스태틱 인스턴스
//	int iInt; // 인스턴스 변수
	// 명시적 초기화
	static int sInt = 1000;; // 스태틱 인스턴스
	int iInt = 2000; // 인스턴스 변수
	
	// 초기화 블럭
	{
		// instance 멤버 초기화
		System.out.println("iInt의 초기값 : " + iInt);
		iInt = 5;
		System.out.println("instance 초기화 블럭 {} " + iInt);
		
	}
	static {
	// static 멤버를 초기화
	System.out.println("siInt의 초기값 : " + sInt);
	sInt = 100;
	System.out.println("static 초기화 블럭  { } " + sInt);
	}
	
	public void acc() { // 인스턴스 메서드
		sInt++;
		this.iInt++;
		 System.out.println
 		("no : " + this.hashCode() + 
		 ", sInt : " + StaticVSInstance1.sInt + 
		 ", iInt : " + this.iInt);
	}
	
	public static void staticMethod() {
//		System.out.println(iInt);
	}
	
	
	public static void main(String[] args) { // 메인 메서드
		for (int i = 0; i < 10; i++) {
			StaticVSInstance1 svi = new StaticVSInstance1();
			svi.acc();
//			acc();
		}
	}

}
