
public class ScoreV1 {

	public static void main(String[] args) {
		// 성적표
		// 국어, 영어, 수학, 총점, 평균, 학점
		String name = "개길동";
		byte kor = 60;
		short eng = 40;
		int math = 91;
		float tot = kor + eng + math;
		float avg = tot / 3;
		String grade = "";
		
		
//		if (avg <= 100 && avg > 90) {
//			grade = "S";
//		} else if(avg <= 90 && avg > 80) {
//			grade = "A";
//		} else if(avg <= 80 && avg > 70) {
//			grade = "B";
//		} else if(avg <= 70 && avg > 60) {
//			grade = "C";
//		} else {
//			grade = "F";
//		}
		


//		switch ((int)Math.floor(avg/10)) {
//		case 10 :
//		case 9 :
//			grade = "a";
//			break;
//		case 8 :
//			grade = "b";
//			break;
//		case 7 :
//			grade = "c";
//			break;
//		case 6 :
//			grade = "d";
//			break;
//		default:
//			grade = "f";
//	}
		// 3항연산자
		char grade1 = (avg >= 90 ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F');
		System.out.println(name + " : " + "평균 " + Math.round(avg * 100.0) / 100.0 + " 학점 " + grade1);
		
		System.out.println("성적표");
		System.out.println("이름\t 국어\t 수학\t 영어\t 총점\t 평균\t 학점\t");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(name + "\t" + kor + "\t" + math+ "\t" + eng + "\t" + tot + "\t" + avg + "\t" + grade1);
		
		// 구구단, 별찍기,
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for (int i = 0; i < 6; i ++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		
		
		
		
		// 1 ~ 100까지 총합, 홀수 총합, 짝수 총합 구하기
		int sum = 0;
		int sumE = 0;
		int sumO = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumE += i;
			}
		}
		System.out.println(sumE);
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sumO += i;
			}
		}
		System.out.println(sumO);
		
	}
}