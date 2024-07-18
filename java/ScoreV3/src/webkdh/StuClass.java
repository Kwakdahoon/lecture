package webkdh;

public class StuClass {
	private int no; // 반번호
	private String className; // 과정명
	private Student[] stuList; // 학생들
	private int totalTot; // 학생전체의 총점
	private float totalAvg; // 학생전체의 평균
	
	public static final int STUDENT_COUNT = 3; // 학생 수 (상수)
	
	// 생성자
	public StuClass(int no, String className) {
		this.no = no;
		this.className = className;
		this.stuList = new Student[STUDENT_COUNT];
	}
	@Override
	public String toString() {
		return "StuClass [반번호=" + no + ", 과정명=" + className + "]";
	}
	public StuClass (int no, String className, Student[] stuList) {
		this.no = no;
		this.className = className;
		this.stuList = stuList;
	}
	// getter, setter

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student[] getStuList() {
		return stuList;
	}

	public void setStuList(Student[] stuList) {
		this.stuList = stuList;
	}
}
