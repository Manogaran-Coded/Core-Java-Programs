package Static_Package;

class Demo{
	//System.out.println("Static Variable intiation");
	static int a;
	static int b;
	static {
		a=30;
		b=40;
	}
	
	static void disp() {
		System.out.println("This is Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	int x;
	int y;
	{
		
		x=55;
		y=99;
	}
	void disp1()
	{
		System.out.println("Non Instance Variable");
		System.out.println("Value of non-instance variable"+x +y);
	}
	 Demo(){
		System.out.println("I am a default constructor");
	}
}

public class LaunchStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.disp();
		Demo d1=new Demo();
		//d1.disp();
		d1.disp1();

	}

}
