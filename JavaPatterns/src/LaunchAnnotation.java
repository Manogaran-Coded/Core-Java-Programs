@FunctionalInterface
interface Trial
{
    int getNum();
    
}
class JavaLearning
{
    public void disp1()
    {
        System.out.println("Parent Display");
    }
}
class Focus extends JavaLearning
{
    @Override
    public void disp1()
    {
        System.out.println("Focus is a Key");
    }
}
public class LaunchAnnotation {
    public static void main(String[] args) {
        
        Trial t=()->
        {
            return 10;
        };
        Focus f=new Focus();
        f.disp1();
        
    }
    
}
