package in.neuron.main;

class Student
{
	public static void main(String args[])
	{
		System.out.println("Float MaX Byte " +Float.BYTES);
		double d=4.5;
		System.out.println("Float"+d);
		byte e;
		e=(byte) d;
		System.out.println("byte"+e);
		int a=5;
		
		int b;
		//b=a++ + a++ + ++a;
		b=a++ + --a - a-- - a++;
		System.out.println("a"+a);
		System.out.println("b"+b);
		
		//5 + 5 -5 - 4
	
		
	}
}