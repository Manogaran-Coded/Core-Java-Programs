package Interface;

class Ione{
	public void m1() 
	{
	}
}

interface Itwo{
	void m2();
}
interface Ithree{
	void m3();
}

class CommonImpl extends Ione implements Itwo,Ithree
{
	public void m2()
	{
		System.out.println("I am M2 Method");
	}
	public void m1()
	{
		System.out.println("I am M1 Method");
	}
	public void m3()
	{
		System.out.println("I am M3 Method");
	}
}

public class SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonImpl ci=new CommonImpl();
		ci.m1();
		ci.m2();
		ci.m3();

	}

}
