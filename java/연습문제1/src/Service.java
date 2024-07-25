
public class Service {

	public void 아무거나(String 매개변수) {
		System.out.println();
//		매개변수.substring(매개변수);
		
		String 포켓볼 = 매개변수.substring(매개변수.lastIndexOf(".") + 1);
		System.out.println("파일 확장자 : " + 포켓볼);
		boolean 진실혹은거짓 = false;
		Parse parse = null;
		if (포켓볼.equals("json")) {
			parse = new Json();
		} else {
			System.out.println("없음");
		}
		if (진실혹은거짓) {
			System.out.println("파싱완료");
		} else {
			System.out.println("실패");
		}
	}
	
}
