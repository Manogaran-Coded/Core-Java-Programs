import java.util.Scanner;

public class LaunchException {
    public static void main(String[] args) {
        try
        {
        System.out.println("Enter Number :: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.println("Enter the Number to Dividee:: ");
        int num2=scan.nextInt();
        int num3=num1/num2;
        System.out.println("Answer is ::"+num3);
        
        System.out.println("Enter Size of an Array:: ");
        int size=scan.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element to be inserted");
        int elem=scan.nextInt();
        System.out.println("Enter the Position where the value should be inserted:: ");
        int pos=scan.nextInt();
        a[pos]=elem;
        System.out.println("Element " +elem+" Inserted at " +pos+" successfully");


        }

  
        catch(ArithmeticException ae)
        {
            System.out.println("Please provide a non-zero dominator");
        }
        catch(NegativeArraySizeException nase)
        {
            System.out.println("Please five Positive Values");
        }
        catch(ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("Be in your Limits. don't cross it");
        }
        catch(Exception e)
        {
            System.out.println("Wrong Input");
        }
       
        System.out.println("Connection is Terminated");
    }
    
}
