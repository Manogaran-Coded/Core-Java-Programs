package HAS_A_Relationship;

public class Emp_Department {
	String deptId;
	String deptName;

	private One_2_Many_Employees[] emps;

	public Emp_Department(String deptId, String deptName, One_2_Many_Employees[] emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.emps = emps;
	}
	public void getDepartmentDetails() {
		System.out.println("Department Details");
		System.out.println("Department Id:: "+deptId);
		System.out.println("Department Name:: "+deptName);
		for(One_2_Many_Employees employee:emps) {
			System.out.println("Employee Details::");
			System.out.println("Employee Id::"+employee.empId);
			System.out.println("Employee Name::"+employee.empName);
			System.out.println("Employee Address::"+employee.empAddr);
			System.out.println();
			
		}
		
	}
	
	

}
