package 강사1;

public abstract class Employee {
	private String empNo;
	private String eName;
	private int deptNo;
	protected int salary;
	
	public Employee() {
		
	}

	public Employee(String empNo, String eName, int deptNo, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.deptNo = deptNo;
		this.salary = salary;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getEmpNo() {
		return empNo;
	}
	
	// 정규직 알바직 사원의 급여 계산 방법이 다르므로 abstract메서드로 만든다.
	public abstract int calSalary();

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", deptNo=" + deptNo + ", salary=" + salary + "]";
	}
}

