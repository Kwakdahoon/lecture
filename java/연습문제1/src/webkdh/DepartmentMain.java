package webkdh;

import employee.ContractWorker;
import employee.Employee;

public class DepartmentMain {

	public static void main(String[] args) {
//		어떤 부서에 2가지 형태의 사원이 근무한다고 하자.
//		모든 사원은 사번, 이름, 소속부서명, 급여를 가지고 있다.
//		정규직 사원 : 기본급 지급
//		알바직 사원 : 급여 = 근무시간 * 시급
//		IT부서에 있는 
//		다형성과 상속관계를 이용해서 구현해 보세요
		
		ContractWorker cW = new ContractWorker(1, "곽다훈", "수금");
		Employee emp = new Employee(2, "Allen kwak", "일수");
		Ceo kwak = new Ceo("곽", "CEO", "남자");
		// 계약직
		kwak.salSal(emp);
		emp.giveSal();
		
		// 정직원
		System.out.println();
		kwak.salSal(cW);
		cW.giveSal();
		
	}

}
