package static_method;

import java.util.Scanner;

class farmer
{
	private double si;
	private static double ri;
	private double pa;
	private double td;

	static
	{
		ri=8.5d;
	}
	void input()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principal Amount:: ");
		pa=scan.nextDouble();
		System.out.println("Enter time duration:: ");
		td=scan.nextDouble();
		
		
	}
	void compute()
	{
		si=(pa*td*ri)/100;
	}
	void disp()
	{
		System.out.println("Simple Interest is :: "+si);
	}

}
public class LaunchStatic {

	public static void main(String[] args) {
		
		farmer f1=new farmer();
		farmer f2=new farmer();
		
		f1.input();
		f1.compute();		
		f1.disp();
		
	}

}
