package webkdh;

public class InstanceCopyMain {

	public static void main(String[] args) {
		Student s1 = new Student("00001", "좆길동", 80, 90, 77);
		s1.displayScore();
		
		// 얕은 복사 shalow
		Student s2 = s1; // s1이 저장하고 있는 주소값을 s2 참조변수에 복사
		s2.setKo(0);
		s1.displayScore();
		s2.displayScore();
		System.out.println("s1.hasgcode : " + s1.hashCode());
		System.out.println("s2.hasgcode : " + s2.hashCode());
		
		// 깊은 복사 deep (생성자를 통해서 깊은 복사)
		Student origins3 = new Student("00002", "씹길동", 81, 30, 100);
		Student deepcopyS3 = new Student(origins3);
		origins3.displayScore();
		deepcopyS3.displayScore();
		System.out.println("origins3.hasgcode : " + origins3.hashCode());
		System.out.println("deepcopy.hasgcode : " + deepcopyS3.hashCode());
		System.out.println("원본수정후");
		origins3.setKo(20);
		origins3.displayScore();
		
		
		
	}

}
