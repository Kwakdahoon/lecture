package webkdh;

public class StuClass {
	// 멤버변수
	private int no; // 반번호
	private String className; // 과정명
	private Student[] stuList; // 
	private int totalTot; // 학생전체의 총점
	private float totalAvg; // 학생전체의 평균

	public static final int STUDENT_COUNT = 3; // 학생 수 (상수)
	
	// 생성자
	public StuClass(int no, String className) {
		this.no = no;
		this.className = className;
		this.stuList = new Student[STUDENT_COUNT]; // [null, null , null]
	}
	// 자동 반, 학생 생성시 사용하는 생성자
	public StuClass(int no, String className, Student[] stuList) {
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


	public void addStudent(Student student, int no) {
		// 학생 한명을 받아 stuList배열의 no번째 요소에 추가
		this.stuList[no] = student;
	}

	public void outputAllStudents(int curStuCount) {
		for (int i = 0; i < curStuCount; i++) {
			System.out.println(stuList[i].toString());
		}
	}
	
	@Override
	public String toString() {
		return "StuClass [반번호=" + no + ", 과정명=" + className + "]";
	}

	public int calTotalTot() {
		ScoreV3Main scoreV3 = new ScoreV3Main();
		for (int i = 0; i < scoreV3.getCurSavedStudentCnt() ; i++) {
			this.totalTot += stuList[i].getTot();
		}
		return totalTot;
	}
	public float calTotalAvg() {
		ScoreV3Main scoreV3 = new ScoreV3Main();
		// 반의 각학생 평균
		this.totalAvg = this.totalTot / 3f / scoreV3.getCurSavedStudentCnt();
		this.totalAvg = Math.round(this.totalAvg * 100) / 100f;
		return this.totalAvg;
	}
	public void searchStudentByNo(String stuNo) {
		boolean isFind = false;
		for (Student s : this.stuList) {
			if (stuNo.equals(s.getStuNo())) {
				System.out.println(" ************* 검색된 학생 정보 *************** ");
				System.out.println(s.toString());
				isFind = true;
			}
		}
		
		if (!isFind) {
			System.out.println("검색된 학생 정보가 없습니다.");
		}
	}

	
}
