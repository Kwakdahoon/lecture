package webkdh;

public class StaticVSInstance1 {
	static int sInt; // 스태틱 인스턴스
	int iInt; // 
	
	public void acc() { // 인스턴스 메서드
		sInt++;
		this.iInt++;
		
		 System.out.println
 		("no : " + this.hashCode() + 
		 ", sInt : " + StaticVSInstance1.sInt + 
		 ", iInt : " + this.iInt);
	}
	
	
	public static void main(String[] args) { // 메인 메서드
		for (int i = 0; i < 10; i++) {
			StaticVSInstance1 svi = new StaticVSInstance1();
			svi.acc();
		}
	}

}
