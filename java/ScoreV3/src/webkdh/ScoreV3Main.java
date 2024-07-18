package webkdh;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreV3Main {

	
	private static void outputMenu() {
		System.out.println("************************************************");
		System.out.println("**                 성적표 V3                  **");
		System.out.println("************************************************");
		System.out.println("** 1. 반 생성                                 **");
		System.out.println("** 2. 생성된 반에 학생 입력 (1번 부터 수행)   **");
		System.out.println("** 3. 전체 학생 점수 출력                     **");
		System.out.println("** 9. 종료                                    **");
		System.out.println("************************************************");
		System.out.print  ("메뉴 번호 입력 >>>>");
	}
	public static void main(String[] args) {
		boolean runBool = true;
		ScoreV3Main scoreV3 = new ScoreV3Main();
		StuClass stuClass = null; // 반객체 초기화
		
		while (runBool) {
			outputMenu();
			Scanner sc = new Scanner(System.in);
			
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("반을 생성합니다...");
				stuClass = scoreV3.createClass();
				break;
			case 2:
				System.out.println("학생을 입력합니다...");
				student(stuClass);
				break;
			case 3:
				System.out.println("전체 학생 점수 출력합니다...");
				scoreV3.outputScore();
				break;
			case 9:
				runBool = false;
//				System.exit(0); // 프로그램 종료
				System.out.println("종료합니다...");			
				}
			
		}
		
	
	}
	private StuClass createClass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반 번호 입력 >>>");
		int classNo = sc.nextInt();
		
		System.out.println("과정명 입력");
		String className = sc.nextLine();
	
		StuClass c1 = new StuClass(classNo, className);
		System.out.println(c1.toString());
		System.out.println(Arrays.toString(c1.getStuList()));
		
		return c1;
		
		
	}
	private void student() {
		
	}
	private void outputScore() {
		
	}
}
