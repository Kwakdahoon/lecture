package webkdh;

public class ConnectMain {

	public static void main(String[] args) {
		ConnectService cs1 = ConnectService.getInstance();
		ConnectService cs2 = ConnectService.getInstance();
		ConnectService cs3 = ConnectService.getInstance();

//		ConnectService test = new ConnectService(); 
		// 기본생성자에 private 접근 제어자를 적용해서 같은 인스턴스를 생성하지 못하도록 만든다.
		if (cs1 == cs2){ // 같은 주소값
			System.out.println("같은 ConnectService객체입니다");
		} else {
			System.out.println("다른 ConnectService객체입니다");
		}
	}

}
