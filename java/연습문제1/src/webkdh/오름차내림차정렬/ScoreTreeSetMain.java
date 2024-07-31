package webkdh.오름차내림차정렬;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScoreTreeSetMain {
	public static void main(String[] args) {
		
		
		String wjdfufwjs = ("ㅡㅡㅡㅡㅡㅡ정렬 전 ㅡㅡㅡㅡㅡㅡㅡ");
		String wjdfufgn = ("ㅡㅡㅡㅡㅡㅡ정렬 후 ㅡㅡㅡㅡㅡㅡㅡ");
		// 반 생성
		StuClass class1 = new StuClass(1);
		TreeSet<Student> stu = new TreeSet<Student>();
		
		
		Student stu1 = new Student("00001" , "훈다훈", 100);
		Student stu2 = new Student("00002" , "가다홍", 80);
		Student stu7 = new Student("00008" , "나다훙", 78); // 겹침
		Student stu8 = new Student("00008" , "곽다훈", 78); // 겹침
		Student stu9 = new Student("00008" , "곽다훈", 50); // 겹침
		// 반에 학생 추가
		class1.addStudent(stu1);
		class1.addStudent(stu2);
		class1.addStudent(stu7);
		class1.addStudent(stu8);
		class1.addStudent(stu9);
		// 반 학생 목록 추가
		class1.outputEntrieStudent();
		
		while (true) {
			System.out.println("1. 학번순 정렬(오름차)");
			System.out.println("2. 이름순 정렬(오름차)");
			System.out.println("3. 성적순 정렬(내림차)");
			System.out.println("9. 종료하기");
			System.out.print("정렬기준을선택하세요 ->");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			Set<Student> output = new TreeSet<Student>(SortManager.getSortMethod(num));
			output.addAll(class1.getStuSet());
			
			for (Student s : output) {
				System.out.println(s);
			}
		}
	}
	
}
