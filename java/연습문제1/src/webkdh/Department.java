package webkdh;

// 부서
public abstract class Department {
	private int empId;
	private String name;
	private String dName;
	
	public Department(int empId, String name, String dName) {
		this.empId = empId;
		this.name = name;
		this.dName = dName;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	
	// 한놈은 기본급 한놈은 시급
	public abstract void giveSal();

	
	@Override
	public String toString() {
		return "사번 = " + empId + ", 이름 = " + name + ", 부서이름 = " + dName;
	}
}
