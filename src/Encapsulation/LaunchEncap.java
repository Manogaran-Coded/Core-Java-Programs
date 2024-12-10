package Encapsulation;


	
	class Student
	{
		private int age;
		private String city;
		private String name;
		void setAge(int a)
		{
			age=a; 
		}
		int getAge()
		{
			return age;
		}
		void setCity(String c)
		{
			city=c;
		}
		String getCity()
		{
			return city;
		}
		void setName(String n)
		{
			name=n;
		}
		String getName()
		{
			return name;
		}
		
		
	}
	public class LaunchEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st=new Student();
		st.setAge(55);
		st.setCity("Chennai");
		st.setName("Manogaran");
		int age=st.getAge();
		String name=st.getName();
		String city=st.getCity();
		System.out.println(age);
		System.out.println(name);
		System.out.println(city);
		
	}

}
