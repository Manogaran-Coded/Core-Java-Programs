package Inheritance;

class Demo
{
	String name="Mano";
	int age=30;
	void disp() {
		System.out.println("Please find the details "+name + " " +age);
	}
}
class Demo1 extends Demo
{
	
}

public class LaunchInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Demo1 d1=new Demo1();
	d1.disp();
	
	}

}
