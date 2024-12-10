package Interface;

interface Sample1
{
	void m1();
}

interface Sample2
{
	void m2();
}



interface Sample3 extends Sample1, Sample2{
	void m3();
}

class Demo implements Sample3{
	public void m1()
	{
		System.out.println("I am M1 Method");
	}
	public void m2()
	{
		System.out.println("I am M2 Method");
	}
	public void m3()
	{
		System.out.println("I am M3 Method");
	}
}
public class ThirdInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1=new Demo();
		d1.m1();
		d1.m2();
		d1.m3();
		

	}

}
