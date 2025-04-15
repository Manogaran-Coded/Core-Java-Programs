interface Mano
{
    public void disp();
    public void weather();
    default void info()
    {
        System.out.println("This is New Interface in Java 8");
        info1();
    }
    static void info1()
    {
        System.out.println("I am Static Method");
    };
}

class Environment implements Mano
{

    @Override
    public void disp() 
    {
        System.out.println("This is a New Display");    
        
    }

    @Override
    public void weather() {
        // TODO Auto-generated method stub
        System.out.println("Summer Weather Started");
    }

}

public class LaunchInterface 
{
    public static void main(String[] args) 
    {
        Environment  e1=new Environment();
        e1.disp();
        e1.weather();
        e1.info();
        //e1.info1
    }    
}
