package Main_Package;
import HAS_A_Relationship.Emp_Department;
import HAS_A_Relationship.Employee;
import HAS_A_Relationship.One_2_Many_Employees;
public class Publish_One_Many_Emps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One_2_Many_Employees emp1=new One_2_Many_Employees("12", "Mano", "ACL");
		One_2_Many_Employees emp2=new One_2_Many_Employees("10", "Gokul", "ACL");
		One_2_Many_Employees emp3=new One_2_Many_Employees("22", "Shan", "ACL");
		
		One_2_Many_Employees[] emps=new One_2_Many_Employees[3];
		emps[0]=emp1;
		emps[1]=emp2;
		emps[2]=emp3;
		Emp_Department dept=new Emp_Department("ACL", "GCL", emps);
		dept.getDepartmentDetails();
	}

}
