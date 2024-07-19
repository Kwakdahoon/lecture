package webkdh;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreV3Main {
	
	private static int curSavedStudentCnt = 0;
	
	public int getCurSavedStudentCnt() {
		return curSavedStudentCnt;
	}
	
	private static void outputMenu() {
		System.out.println("*******************************************************");
		System.out.println("**                    성 적 표 V3                    **");
		System.out.println("*******************************************************");
		System.out.println("** 1. 반 생성                                        **");
		System.out.println("** 2. 생성된 반에 학생 입력 (1번 부터 수행)          **");
		System.out.println("** 3. 전체 학생 점수 출력                            **");
		System.out.println("** 4. 반, 학생 자동 생성                             **");
		System.out.println("** 5. 학번으로 검색                                  **");
		System.out.println("** 9. 종료                                           **");
		System.out.println("*******************************************************");
		System.out.print("메뉴 번호 입력 >>>>");
	}
	
	public static void main(String[] args) {
		boolean runBool = true;
		ScoreV3Main scoreV3 = new ScoreV3Main();
		
		StuClass stuClass = null; // 반객체 초기화 
		while(runBool) {
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
				scoreV3.inputStudent(stuClass);
				break;
			case 3:
				System.out.println("전체 학생 점수 출력합니다....");
				scoreV3.outputEntireStudent(stuClass);
				break;
			case 4:
				stuClass = scoreV3.autoInputStudent(); // 반, 학생 자동 생성 
				break;
			case 5:
				scoreV3.searchStudentByNo(stuClass); // 학번으로 검색
				break;
			case 9:
				runBool = false;
//				System.exit(0); // 프로그램 종료
				break;
			}
		}
		
	}

	private void searchStudentByNo(StuClass stuClass) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학번 >>>");
		String stuNo = sc.nextLine();
		stuClass.searchStudentByNo(stuNo);
	}

	private StuClass autoInputStudent() {
		Student[] stuList = {new Student("24001", "홍길동", 78, 66, 34), 
				new Student("24002", "홍길서", 55, 55, 44),
				new Student("24003", "홍길남", 99, 55, 34), 
				new Student("24004", "홍길북", 99, 56, 35)};
//		curSavedStudentCnt = 4;
		curSavedStudentCnt = stuList.length;
		StuClass stuClass = new StuClass(2, "jsp", stuList);
		return stuClass;
		
	}

	private void outputEntireStudent(StuClass stuClass) {
		System.out.println("============================================");
		System.out.println("                  성  적  표                ");
		System.out.println("============================================");
		System.out.println("반 번호 : " + stuClass.getNo() + ", 과정명 : " + stuClass.getClassName());
		System.out.println("----------------------------------------------------");
		stuClass.outputAllStudents(curSavedStudentCnt);
		
		System.out.println("----------------------------------------------------");
		System.out.println("전체 총점 : " + stuClass.calTotalTot() + ", 전체 평균 : " + stuClass.calTotalAvg());
	}

	private void inputStudent(StuClass stuClass) {
		if (stuClass == null) {
			System.out.println("반 부터 생성하고 오세요......");
		} else {
			if (curSavedStudentCnt < StuClass.STUDENT_COUNT) {
				// 학생 입력
				Scanner sc = new Scanner(System.in);
				System.out.print("학생 번호 >>>");
				String stuNo = sc.nextLine();
				System.out.print("학생 이름 >>>");
				String stuName = sc.nextLine();
				System.out.print("국어 점수 >>>");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수 >>>");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수 >>>");
				int math = Integer.parseInt(sc.nextLine());
		//		Student stu1 = new Student(stuNo, stuName, kor, eng, math)
		//		addStudent(stu1);
				stuClass.addStudent(new Student(stuNo, stuName, kor, eng, math), curSavedStudentCnt);
				curSavedStudentCnt++;
			} else {
				System.out.println("학생수가 초과됩니다.");
			}
		}
		
	}

	private StuClass createClass() {
		curSavedStudentCnt = 0; // 반생성시, 저장된 학생수 초기화
		Scanner sc = new Scanner(System.in);
		System.out.print("반번호 입력 >>>");
		int classNo = sc.nextInt();
		sc.nextLine();
		System.out.print("과정명 입력 >>>");
		String className = sc.nextLine();
		
		StuClass c1 = new StuClass(classNo, className);
		System.out.println(c1.toString());
		System.out.println(Arrays.toString(c1.getStuList()));
		
		return c1;
	}

}
