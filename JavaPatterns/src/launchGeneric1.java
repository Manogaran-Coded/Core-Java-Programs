import java.util.ArrayList;

public class launchGeneric1 {
    public static void main(String[] args) 
    {
        ArrayList <String> al=new ArrayList<String>();
        al.add("Sachin");
        m1(al);
        System.out.println(al);
       
        
    }
    public static void m1(ArrayList al)
    {
        al.add(10);
        al.add("Dhoni");
        //System.out.println(al);
    }
    
}
