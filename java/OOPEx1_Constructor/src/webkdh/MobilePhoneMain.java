package webkdh;

public class MobilePhoneMain {

	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone(); // 기본생성자를 실행시켜 인스턴스 생성
//		System.out.println(phone.hashCode());
//		System.out.println(phone.toString());
		
		MobilePhone galaxy = new MobilePhone("삼성", "갤럭시S24", 256, "흰색"); // 오버로딩한 생성자 호출해 인스턴스 생성
		System.out.println(galaxy.toString());
		
		MobilePhone iphone = new MobilePhone("애플", "아이폰15");
		System.out.println(iphone.toString());
		
		MobilePhone sexChina = new MobilePhone("샤오미" , "샤샤샤");
		System.out.println(sexChina.toString());
		
		MobilePhone galaxy1 = new MobilePhone("흰색", 512);
		System.out.println(galaxy1);
		
		MobilePhone sphone2 = new MobilePhone("샤오미", "홍미폰");
		System.out.println(sphone2);
		
//		galaxy.mainMemory = 1500; // MobilePhone 클래스에서 멤버 변수에 private 제어자를 적용
		// The field MobilePhone.mainMemory is not visible0
//		System.out.println("getter : " + galaxy.getBrandName());
		galaxy.setBrandName("Samsung");
		System.out.println(galaxy.toString());
		
		if(galaxy.setMainMemory(1025) == false) {
			System.out.println("메모리 업그레이드 실패");
		} else {
			System.out.println("메모리 업그레이드 성공");
		}
		System.out.println(galaxy.toString());
	}
	
	

}
