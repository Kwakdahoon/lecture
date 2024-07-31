package webkdh.오름차내림차정렬;

import java.util.Set;
import java.util.TreeSet;

public class StuClass {
	private int classNo;
	private Set<Student> stuSet;
	
	// 생성자 constructor using filed
	public StuClass(int classNo) {
		super();
		this.classNo = classNo;
//		this.stuSet = new TreeSet<Student>();
		this.stuSet = new TreeSet<Student>(new DescendingByStuScore());
	}

	public Set<Student> getStuSet() {
		return stuSet;
	}

	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}

	public int getClassNo() {
		return classNo;
	}
	
	// 학생을 TreeSet에 추가
	public void addStudent(Student s) {
		boolean existStudent = false;
		for(Student stu : this.stuSet) {
			if (stu.getStuNum().equals(s.getStuNum()));
			existStudent = true;
			break;
		} 
		if (!existStudent) {
			this.stuSet.add(s);
		} else {
			System.out.println("학번 : " + s.getStuNum() + " 이미 존재함");
		}
//	this.stuSet.add(s);
		}
	
	public void outputEntrieStudent() {
		for(Student s : this.stuSet) {
			System.out.println(s);
		}
	}
	
	
}
