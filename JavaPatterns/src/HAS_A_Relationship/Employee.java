package HAS_A_Relationship;

public class Employee {
	String eName;
	String eID;
	String eAddress;
	
	Account account;
	//Has-A Relationship

	public Employee(String eName, String eID, String eAddress, Account account) {
		super();
		this.eName = eName;
		this.eID = eID;
		this.eAddress = eAddress;
		this.account = account;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details are:: ");
		System.out.println("Employee Id :: "+eID);
		System.out.println("Employee Name:: "+eName);
		System.out.println("Employee Address:: "+eAddress);
		System.out.println("Employee Account:: "+account.accNo);
		System.out.println("Employee Name:: "+account.accName);
		System.out.println("Employee Acct Type:: "+account.accType);
	}
}

