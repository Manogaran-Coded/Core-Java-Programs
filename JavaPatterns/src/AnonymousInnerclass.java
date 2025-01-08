interface Demo
{
    void disp();
    void add(int a,int b);
}


public class AnonymousInnerclass {
    public static void main(String[] args) {
        Demo d=new Demo(){
            public void disp()
            {
                System.out.println("Hello I am Disp Method");

            }
            public void add(int a, int b)
            {
                int c=a+b;
                System.out.println("Add Value is:: "+c);
            }
            
        };
        d.disp();
        d.add(10,20);
    }
    
}
