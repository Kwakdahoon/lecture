package employee;

import webkdh.Department;

// 정직원
public class Employee extends Department{
	private int basePay = 2060740; // 기본급
	
	public Employee (int empId, String name, String dName) {
		super(empId, name, dName);
	}
	
	@Override
	public void giveSal() {
		System.out.println("뭐 이런걸 다");
	}


	@Override
	public String toString() {
		return "정직원 : " + super.toString() + ", 월급 : " + basePay + "원";
	}
}
