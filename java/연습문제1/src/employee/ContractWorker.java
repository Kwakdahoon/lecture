package employee;

import java.util.Scanner;

import webkdh.Department;

// 계약직
public class ContractWorker extends Department{
//	private int hW; // hourlyWage (시급제)
	Scanner sc = new Scanner(System.in);
	private int sal;
//	private int time = sc.nextInt();
	private int time = 160; // 근무시간
	private int hourly = 9860;// 9860 최저시급
	public ContractWorker(int empId, String name, String dName) {
		super(empId, name, dName);
		this.sal = time * hourly;
	}
	
//	public int timeInput(int time) {
//		 this.time = sc.nextInt();
//		 System.out.println("일한시간 쳐입력하세요");
//		return time;
//	}
	
	@Override
	public void giveSal() {
		System.out.println("계약직 뭣같네");
	}
	
	public String toString() {
		return "계약직 : " + super.toString() + ", 월급 : " + sal + "원";
	}
	
}
