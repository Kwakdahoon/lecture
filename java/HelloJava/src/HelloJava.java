//주석
/*
 * 규칙) public class가 있는 경우, 소스파일의 이름은 public class의 이름과 일치해야 한다.
 * */
public class HelloJava { // HelloJava 클래스의 시작

	public static void main(String[] args) { // main 메서드 (프로그램 실행 시작점) 시작
		System.out.println("Hellow, Java!"); // 줄바꿈 
		System.out.print("Hellow, Java!"); // 한줄 출력
		System.out.println("안녕, 자바");
	}

} // HelloJava 클래스의 끝

class HelloA {
	static void sayhello() {
		System.out.println("say Hello");
	
	}
}