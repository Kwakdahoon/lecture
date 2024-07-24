package 강사1;

public class Permanant extends Employee{

	public Permanant(String empNo, String eName, int deptNo, int salary) {
		super(empNo, eName, deptNo, salary);
	}

	@Override
	public int calSalary() {
		// TODO Auto-generated method stub
		return super.salary;
	}
	@Override
	public String toString() {
		return "Permanant []" + super.toString();
	}
}
