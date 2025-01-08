
@FunctionalInterface
interface Demo
{
    void disp();
}


public class FirstLambda 
{
    public static void main(String[] args) 
    {
        
    
        Demo d=()->
        {
            System.out.println("Hello ineuron");
        };
        d.disp();
    }
}
