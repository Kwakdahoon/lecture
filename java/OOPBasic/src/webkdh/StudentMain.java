package webkdh;

import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student(); 

		student.name = "홍길동";
		student.kor = 50;
		student.grade ='D';
		
		System.out.println("student : name = " + student.name + ", kor = " + student.kor + ", grade = " + student.grade);
		
		Student stu1 = new Student();
		stu1.name = "둘리";
		stu1.kor = 80;
		stu1.grade = 'B';
		System.out.println("stu1 : name = " + stu1.name + ", kor = " + stu1.kor + ", grade = " + stu1.grade);
		
		Student[] students = new Student[2];
		students[0] = stu1;
		students[1] = student;
		System.out.println("name = " + students[0].name + ", kor = " + students[0].kor + ", grade = " + students[0].grade);
		System.out.println("name = " + students[1].name + ", kor = " + students[1].kor + ", grade = " + students[1].grade);
//		System.out.println(Arrays.toString(students));
		
		// Student 객체의 메서드 displayStudent() 호출
		student.displayStudent();
	}

}
