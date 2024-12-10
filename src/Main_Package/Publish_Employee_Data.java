package Main_Package;
import HAS_A_Relationship.Account;
import HAS_A_Relationship.Employee;

public class Publish_Employee_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("ACB123","Sachin","Savings");
		//Constructor Injection 
		Employee emp=new Employee("A1314","Sachin","IND",account);
		emp.getEmployeeDetails();
	}

}

