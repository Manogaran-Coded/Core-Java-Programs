package Inheritance;

class Parentt
{
	int a,b;
	Parentt()
	{
		a=20;
		b=40;
		System.out.println( "Parent Constructor");
	}
	Parentt(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("This is Para Constructor");
	}
		
}
class Childd extends Parentt
{
	int x,y;
	Childd()
	{
		super();
		x=80;
		y=100;
	}
	Childd(int x, int y){
		this.x=x;
		this.y=y;
	System.out.println("Child Constructor");
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
	


public class LaunchConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Childd ch=new Childd();
	
		
	ch.disp();
	Childd ch1=new Childd(1000,20000);
	ch1.disp();
	
		
	}

}
