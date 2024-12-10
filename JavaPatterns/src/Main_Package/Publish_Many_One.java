package Main_Package;

import HAS_A_Relationship.Branch;
import HAS_A_Relationship.Student_Many_One;

public class Publish_Many_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch branch=new Branch();
		branch.setBrchId("f333");
		branch.setBrchName("India");
		
		
		Student_Many_One s1=new Student_Many_One();
		s1.setStdId("K2113");
		s1.setStdName("Kohli");
		s1.setStdAddress("RCB");
		s1.setBranch(branch);
		
		Student_Many_One s2=new Student_Many_One();
		s2.setStdId("S3313");
		s2.setStdName("Sachin");
		s2.setStdAddress("MI");
		s2.setBranch(branch);
		
		Student_Many_One s3=new Student_Many_One();
		s3.setStdId("D32793");
		s3.setStdName("Dhoni");
		s3.setStdAddress("CSK");
		s3.setBranch(branch);
		
		
		System.out.println("Student Name:: "+s1.getStdId());
		System.out.println("Student Name:: "+s1.getStdName());
		System.out.println("Student Name:: "+s1.getStdAddress());
		System.out.println("Branch:: "+s1.getBranch().getBrchId());
		System.out.println("Branch:: "+s1.getBranch().getBrchName());
		

		
		System.out.println("Student Name:: "+s2.getStdId());
		System.out.println("Student Name:: "+s2.getStdName());
		System.out.println("Student Name:: "+s2.getStdAddress());
		System.out.println("Branch:: "+s2.getBranch().getBrchId());
		System.out.println("Branch:: "+s2.getBranch().getBrchName());


		System.out.println("Student Name:: "+s3.getStdId());
		System.out.println("Student Name:: "+s3.getStdName());
		System.out.println("Student Name:: "+s3.getStdAddress());
		System.out.println("Branch:: "+s3.getBranch().getBrchId());
		System.out.println("Branch:: "+s3.getBranch().getBrchName());
		
		

	}

}
