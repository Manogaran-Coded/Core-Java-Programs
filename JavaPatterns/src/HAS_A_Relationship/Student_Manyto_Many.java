package HAS_A_Relationship;

public class Student_Manyto_Many {

	String stdId;
	String stdName;
	String stdAddr;
	
	//Has-A
	private Course_Many_to_Many[] course;

	//Constructor Injection
	public Student_Manyto_Many(String stdId, String stdName, String stdAddr, Course_Many_to_Many[] course) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddr = stdAddr;
		this.course = course;
	}
	
	public void getStudentDetails() {
		
		System.out.println("Student Details");
		System.out.println("Student ID:: "+stdId);
		System.out.println("Student ID:: "+stdName);
		System.out.println("Student ID:: "+stdAddr);
		System.out.println("Course Details are:: ");
		for(Course_Many_to_Many c:course) {
			
			System.out.println("Course Id::" +c.cId);
			System.out.println("Course Id::" +c.cName);
			System.out.println("Course Id::" +c.cCost);
			
		}
		
		
	}
}
