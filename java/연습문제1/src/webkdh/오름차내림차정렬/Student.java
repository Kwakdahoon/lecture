package webkdh.오름차내림차정렬;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String stuNum;
	private String name;
	private int score;

	public Student (String stuNum, String name, int score) {
		this.stuNum = stuNum;
		this.name = name;
		this.score = score;
	}

	public String getStuNum() {
		return stuNum;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return stuNum.compareTo(o.stuNum);
//			return this.score < o.score  ? 1 : this.score == o.score ? 0 : -1; // 성적 오름차
//			return this.score < o.score  ? -1 : this.score == o.score ? 0 : 1; // 성적 내림차
		}

	@Override
	public boolean equals(Object obj) {
		Student temp = (Student) obj;
		if(stuNum.equals(temp.stuNum)) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

	@Override
	public String toString() {
		return "학번 " + stuNum + ", 이름 " + name + ", 성적 " + score;
	} 
	}
	
