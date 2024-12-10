package Interface;


/*
 * 1.Any Service Requirement is called Interface
 * 2.Inside Interface every method is always abstract whether we are declaring or not 
 * hence interface is considered as 100% pure abstract class . Also, methods by default public and abstract.
 * 3.To Achiever 100% abstract class we go for interface since in abstract class we can have concrete method as well
 * 4.From client point of view an interface defind the set of services what is expecting. From service provider point of 
 * view an interface the set of services what is "offering". So interface acts a contrat b/w client and service provider
 * Example : GUI screen of ATM defines the set of services what the customer is expecting, Bank people
 * offered the same set of services what the customer is expecting. Customer => GUI=> Bank
 */

interface sample
{
	void m1();
	void m2();
}

abstract class sampleImp implements sample
{
	@Override //indication to compiler that these methods are overriden methods
	public void m1()
	{
		System.out.println("This is M1 method");
	}
}

class subsampleImp extends sampleImp
{
	@Override
	public void m2() {
		System.out.println("This is m2");
	}
}

public class FirstInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample si=new subsampleImp();
		si.m1();
		si.m2();
	
	}

}
