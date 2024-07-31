package webkdh.treeset;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InfoMain {
	public static void main(String[] args) {
		String wjdfufwjs = ("ㅡㅡㅡㅡㅡㅡ정렬 전 ㅡㅡㅡㅡㅡㅡㅡ");
		String wjdfufgn = ("ㅡㅡㅡㅡㅡㅡ정렬 후 ㅡㅡㅡㅡㅡㅡㅡ");
//		여러명의 학생이 있다고 하자.
//		학생은 학번, 이름, 점수를 가지고 있다.
//		아래의 조건이 충족되도록 프로그래밍 하세요
//		학번이 같으면 같은 학생으로 취급한다.
//		점수 | 학번 | 이름 을 기준으로 정렬되어 TreeSet에 저장될 수 있도록 하세요.

		
		TreeSet<Student> stu = new TreeSet<Student>();
		
		Student stu1 = new Student("00001" , "정다훈", 100);
		Student stu2 = new Student("00002" , "이다홍", 80);
//		StuScore stu3 = new StuScore("00003" , "김다훙", 45);
//		StuScore stu4 = new StuScore("00004" , "소다훙", 14);
//		StuScore stu5 = new StuScore("00005" , "혜다훙", 64);
//		StuScore stu6 = new StuScore("00006" , "란훙", 74);
		Student stu7 = new Student("00008" , "걱다훙", 90); // 겹침
		Student stu8 = new Student("00008" , "곽다훈", 78); // 겹침
		

		
		stu.add(stu1);
		stu.add(stu2);
//		stu.add(stu3);
//		stu.add(stu4);
//		stu.add(stu5);
//		stu.add(stu6);
		stu.add(stu7);
		stu.add(stu8);
//		System.out.println(stu7.equals(stu8));
//		System.out.println(stu7.hashCode());
//		System.out.println(stu8.hashCode());
		
//		System.out.println(stu);
		for(Student s : stu) {
			System.out.println(s);
		}
		
		// 성적 비교기
		System.out.println();
		Score sc = new Score();
		TreeSet<Student> scoreSet = new TreeSet<Student>();
//		scoreSet.add(stu1);
//		scoreSet.add(stu2);
//		scoreSet.add(stu7);
//		scoreSet.add(stu8);
		

		
		for(Student s : scoreSet) {
			scoreSet.add(s);
		}
		for(Student s : scoreSet) {
			System.out.println(s);
		}
		
//		System.out.println("Score : " + wjdfufwjs);
//		System.out.println(stu);
////		stu.sort(null);
//		System.out.println("Score : " + wjdfufgn);
//		System.out.println(stu);
//		System.out.println();
//	
//		System.out.println("name : " + wjdfufwjs);
//		System.out.println(stu);
////		stu.sort(new StuName());
//		System.out.println("name : " + wjdfufgn);
//		System.out.println(stu);
//		
//		System.out.println();
//		System.out.println(wjdfufwjs);
//		System.out.println(stu);
////		stu.sort(new StuNum());
//		System.out.println(wjdfufgn);
//		System.out.println(stu);		
	}
}
