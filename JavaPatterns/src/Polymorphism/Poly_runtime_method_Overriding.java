package Polymorphism;


class Parent1{
	public void cry()
	{
	System.out.println("Parent1 is Crying");
	
}
}
class Child1 extends Parent1{
	public void cry() {
		System.out.println("Child1 is Crying");
	}
}

class Child2 extends Parent1{
	public void cry() {
		System.out.println("Child2 is Crying");

	}
}

class Child3
{
	public void cry(Parent1 pp)
	{
		pp.cry();
	}
}

public class Poly_runtime_method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Child1();//Loose Coupling or Upcasting
		Parent1 p2=new Child2();
		Child3 c3=new Child3();
		//Child1 c1=new Child1();//Tight Coupling or 
		//c1.cry();
		//Child2 c2=new Child2();
		//c2.cry();
		
		p.cry();
		p2.cry();
		c3.cry(p);
			
	}

}
