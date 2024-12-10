package Program_Abstract;

import java.util.Scanner;

abstract class Shapes{
	float area;
	abstract void input();
	abstract void compute();
	public void disp() {
		System.out.println("The Area is:: "+area);
	}
}

class Rectangle extends Shapes{
	float length;
	float breadth;
	public void input(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Lenght of Rectangle");
		length=scan.nextFloat();
		System.out.println("Enter the Breadth of Rectangle");
		breadth=scan.nextFloat();
	}
	public void compute() {
		area=length*breadth;
	}

}

class Square extends Shapes{
	float length; 
	public void input() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of Square");
		length=scan.nextFloat();		
	}
	
	public void compute() 
	{
		area=length*length;
	}

	
}

class Circle extends Shapes{
	float radius;
	final float pi=3.14f;
	
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of Circle:: ");
		radius=scan.nextFloat();
	}
	public void compute() {
		area=radius*pi;
	}
	
}

class Geometry{
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}
public class Project_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
	}

}
