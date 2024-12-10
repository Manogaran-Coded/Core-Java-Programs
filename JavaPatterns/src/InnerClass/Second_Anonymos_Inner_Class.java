package InnerClass;

abstract class Computer1{
	
	public abstract void config();
	
}

public class Second_Anonymos_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer1 c=new Computer1()
		{
			
			public void config()
			{
				System.out.println("Its Working fine now");
			}
		};
		
		c.config();
		

	}

	

}
