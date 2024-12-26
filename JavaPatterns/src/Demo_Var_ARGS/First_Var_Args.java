package Demo_Var_ARGS;

class Demo{

    public void add(int...x)
    {
        
        int total=0;
        //System.out.println("This is Var-Args Method");
        for(int i=0;i<x.length;i++)
        {
           total+=x[i];
            
        }
        System.out.println(total);
    }

}
public class First_Var_Args {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add();
        d.add(10);
        d.add(10,20);
            
    }
    
}
