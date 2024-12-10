package InnerClass;

class Computer{
	public void config() {
		System.out.println("Hello Computer");
	}
}

public class Anonymos_Inner_Class extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer() 
		{
			public void config() 
			{
				System.out.println("Anonymos Inner Class");
			}
		};

		c.config();
	}

}
