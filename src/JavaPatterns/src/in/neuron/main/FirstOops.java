package in.neuron.main;
class Student1
{
	
	void playCricket()
	{
		System.out.println("I am playing Cricket");
		
	}
	void sleep()
	{
		System.out.println("I am Sleeping");
	}
}
class FirstOops{
	public static void main(String []args)
	{
		Student1 std=new Student1();
		std.playCricket();
		std.sleep();
	}
}