import java.util.ArrayList;

public class Launcharraylist {
    public static void main(String[] args) {
        ArrayList<Object> al=new ArrayList<>();
        al.add(20);
        al.add(40);
        al.add(50);
        al.add(75);
        al.add(50);
        al.add("Mano");
        System.out.println(al);
        al.addFirst(10);
        System.out.println("After Adding First Element:: " +al);
        al.addLast(60 );
        System.out.println("End of Adding First Element:: "+al);
        System.out.println("Finding Value::: "+al.contains(40)); 
        System.out.println("To Check whether Array List is Empty or not"+al.isEmpty());
        al.ensureCapacity(5);
        
        System.out.println(al);
        System.out.println(al.size());
    }
    
}
 