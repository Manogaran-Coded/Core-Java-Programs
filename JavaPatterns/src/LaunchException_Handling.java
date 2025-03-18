import java.util.Scanner;

class Alpha
{
    void alpha() throws ArithmeticException
    {
        try
        {
            Scanner scan=new Scanner(System.in);
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            int num3=num1/num2;
            System.out.println("Output is:: "+num3);
        }
        catch (ArithmeticException ae)
        {
            
            System.out.println("Not Divide number by Zero");
            throw ae;
        }
        finally
        {
            System.out.println("This is Finally Block");
        }

    }
}

public class LaunchException_Handling {
s    public static void main(String[] args) {
        Alpha al=new Alpha();
        al.alpha();
        
    }
    
}
