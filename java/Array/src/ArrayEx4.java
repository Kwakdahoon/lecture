import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		// 학생 4명의 이름, 국어, 영어, 수학 점수를 입력받아서 2차원에 저장하고, 출력하세요.
		// 총점 평균
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수>>>>");
		int cntStudent = sc.nextInt(); // 4\n
		sc.nextLine(); // \n제거
		
		// 학생 2차원 String타입의 배열 생성
		String[][] students = new String[cntStudent][6];
		
		for (int i= 0; i < cntStudent; i++) {
			System.out.println((i + 1) + "학생 이름>>>");
			students[i][0] = sc.next();
			
			System.out.println((i + 1) + "학생 국어>>>");
			students[i][1] = sc.next();
			
			System.out.println((i + 1) + "학생 영어>>>");
			students[i][2] = sc.next();
			
			System.out.println((i + 1) + "학생 수학>>>");
			students[i][3] = sc.next();
			
			int tot = Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2])
			+ Integer.parseInt(students[i][3]);
			students[i][4] = String.valueOf(tot); // 총점
			students[i][5] = String.valueOf(tot / 3.0); // 평균 (소수점)
		}
		
		// student 배열 출력
		System.out.println("이 름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int r = 0; r < cntStudent; r++) {
			for (int c = 0; c < students[r].length; c++) {
				System.out.print(students[r][c] + "\t");
			}
			System.out.println();
		}
		
	}

}
