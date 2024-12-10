package HAS_A_Relationship;

public class One_2_Many_Employees {
	
	String empId;
	String empName;
	String empAddr;
	public One_2_Many_Employees(String empId, String empName, String empdept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empdept;
	}
	public void getEmployeeDetails() {
		System.out.println("The Emp Id:: "+empId);
		System.out.println("The Emp Name:: "+empName);
		System.out.println("The Emp Id:: "+empAddr);
	
	}

}
