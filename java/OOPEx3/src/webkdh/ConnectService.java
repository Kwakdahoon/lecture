package webkdh;

public class ConnectService {
	// 싱글톤 
	private static ConnectService instance = new ConnectService();
	
	private ConnectService() { }; // 생성 못하게 만들어벌임
	
	public static ConnectService getInstance() {
		
		return instance;
	}

}