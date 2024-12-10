package Main_Package;

import HAS_A_Relationship.Course_Many_to_Many;
import HAS_A_Relationship.Student_Manyto_Many;

public class Publish_Many_to_Many {
	
	public static void main(String []args)
	{
		Course_Many_to_Many  c1=new Course_Many_to_Many("A1", "Java", 5000);
		Course_Many_to_Many  c2=new Course_Many_to_Many("A2", "SRE", 6000);
		Course_Many_to_Many  c3=new Course_Many_to_Many("A3", "AI", 8000);
		
		Course_Many_to_Many[] course=new Course_Many_to_Many[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Student_Manyto_Many s1 =new Student_Manyto_Many("Ind1", "Jai", "Delhi", course);
		Student_Manyto_Many s2 =new Student_Manyto_Many("Ind2", "Prakash", "Chennai", course);
		Student_Manyto_Many s3 =new Student_Manyto_Many("Ind3", "Vijay", "Chennai", course);
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		
	}

}
