package InnerClass;

class A
{
	public void show() {
		System.out.println("Class A");
	}
	class B
	{
		public void show() {
			System.out.println("Class B");
		}
	}
}

public class First_Inner_Class {
	
	public static void main(String []args)
	{
		A a=new A();
		a.show();
		A.B b;
		b= a.new B();
		b.show();
	}

}
