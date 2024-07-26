package webkdh.throwex;

public class ThrowMain {

	public static void main(String[] args) {
		Student st1 = null;
		try {
			
		st1 = new Student("1", "개병신", -80, 10, 100);
		st1.displayScore();
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
			System.out.println("국어 점수 느금마입니다.");
		} catch (NullPointerException e) {
			System.out.println("점수가 느금마입니다");
		}
		
		
	}

}
