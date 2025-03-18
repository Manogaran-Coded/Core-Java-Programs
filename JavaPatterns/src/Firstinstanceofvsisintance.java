import java.util.ArrayList;

class Student
{
    public void study()
    {
        System.out.println("Student is Studying");
    }
}

class Cricket
{
    public void playCricket()
    {
        System.out.println("Playing Cricket");
    }
}

class Customer{
    public void buyProduct()
    {
        System.out.println("Customer is buying a Product");
    }
}

public class Firstinstanceofvsisintance 
{
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException 
    {
       
        @SuppressWarnings("rawtypes")
        ArrayList al=new ArrayList<>();
        al.add(new Student());
        al.add(new Cricket());
        al.add(new Customer());
        Object o=al.get(1);
        if(o instanceof Student)
        {
         Student s=(Student) o;
         s.study();
        }
        else if(o instanceof Customer)
        {
            Customer c=(Customer) o;
            c.buyProduct();
        }
        else if(o instanceof Cricket)
        {
            Cricket cr=(Cricket) o;
            cr.playCricket();
        }
        Thread t=new Thread();
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);

        Student s1=new Student();
        System.out.println(Class.forName(args[0]).isInstance(s1));

    }


}
