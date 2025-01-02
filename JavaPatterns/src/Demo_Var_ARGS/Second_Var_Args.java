package Demo_Var_ARGS;

class Demo{
    public void m1(int[][]... x)
    {
        System.out.println(x);
        for(int e[][]:x)
        {
            System.out.println(e);
            for(int c[]:e)
            {
                System.out.println(c);
                for(int f:c)
                {   
                    System.out.println(f);
                    
                }
            }
            
        
        
        }

    }
}

public class Second_Var_Args {
    public static void main(String[] args) {
        int a[][]={{10,20,30},{40,50}};
        int b[][]={{60,70},{80}};
        int d[][]={{90},{100}};

       


        Demo d1=new Demo();
        d1.m1(a,b,d);
   
    }

    
    
}
