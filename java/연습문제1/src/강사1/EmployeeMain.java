package 강사1;

public class EmployeeMain {

	public static void main(String[] args) {
		Department 아이티부서 = new Department(10, "IT");
		
		// 사원 배치방법
		// 1) Composition
//		아이티부서.addEmployee(new Permanant("24001", "홍길동", 10, 2000000));
//		아이티부서 = null;
//		아이티부서.몰라시발();
		// 또는
		
		// 2) Aggregation
		Employee 채길동 = new Permanant("24002", "채길동", 10, 2000000);
		아이티부서.addEmployee(채길동);
//		아이티부서 = null;
//		아이티부서.몰라시발();
		
		// 문자열만 있어서 sout 반환해줘야함
		System.out.println(채길동.toString());
		
		PartTimer 장길동 = new PartTimer("24003", "장길동", 10, 10, 10000);
		System.out.println(장길동.toString());
		아이티부서.addEmployee(장길동);
		
		아이티부서.뽀이치();
	}

}
