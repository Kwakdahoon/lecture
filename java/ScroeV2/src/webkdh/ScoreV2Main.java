package webkdh;

public class ScoreV2Main {

	public static void main(String[] args) {
		Student s1 = new Student("00001", "좆길동", 98, 80, 85);
		System.out.println("s1 : 초기성적");
		s1.displayScore();
		s1.setKo(100); // 국어수정
		
		Student s2 = new Student("00002", "미친련", 68, 40, 55);
		System.out.println("s2 : 초기성적");
		s2.displayScore();
		s2.setEg(66);
		s2.setKo(100);
		s2.displayScore();
		
		Student s3 = new Student("00003", "개길동", 18, 40, 65);
		System.out.println("s3 : 초기성적");
		s3.displayScore();
		s3.setEg(86);
		s3.setKo(98);
		s3.displayScore();
		
		// 전체총점
		
		// System.out.println(s1.getTotalTot()); // 0
//		System.out.println(s1.getTot()); // 0
//		System.out.println(s2.getTot()); // 0
//		System.out.println(s3.getTot()); // 0
		System.out.println(Student.getTotalTot()); // 0
		
		// s2의 영어 점수 수정
		System.out.println("s2 영어점수 수정");
		s2.setEg(66);
		s2.displayScore();
		System.out.println("s1의 총점 : " + s1.getTot());
		System.out.println("s2의 총점 : " + s2.getTot());
		System.out.println("s3의 총점 : " + s3.getTot());
		System.out.println("전체 총점 : " + Student.getTotalTot());
		
	}

}
