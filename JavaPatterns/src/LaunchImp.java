import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class LaunchImp {
    public static void main(String[] args) {
        ArrayList<Object> al=new ArrayList<>();
        al.add(20);
        al.add(25);
        al.add(30);
        System.out.println(al);
        for(int i=0;i<al.size();i++)
        {
            //System.out.print(al.get(i));
            Object ob=al.get(i);
            System.out.println(ob);
        }
        System.out.println("**************");
        Iterator<Object> itr=al.iterator();
        while(itr.hasNext()==true)
        {
            Object obj=itr.next();
            System.out.println(obj);
        }
        ListIterator<Object> ltr=al.listIterator(al.size());
        while(ltr.hasPrevious())
        {
            System.out.println(ltr.previous());
        }

        LinkedList<Object> ll=new LinkedList<>();
        ll.add(45);
        ll.add(55);
        ll.add(65);
        ll.add(75);
        ll.add(85);
        ll.add(95);
        System.out.println("Linked List"+ll);
        Iterator<Object> itr3=ll.iterator();
        //Integer i1=(Integer) itr3.next();
        ListIterator<Object> litr3=ll.listIterator(ll.size());
        //ListIterator<Object> litr3=ll.descendingIterator();
        while(itr3.hasNext())
        {
            Integer i3=(Integer) itr3.next();
            System.out.println("Linked List while:: "+i3);
            

        }
        while(litr3.hasPrevious())
        {
            Integer i4=(Integer) litr3.previous();
            System.out.println("Linked List in previous:: "+i4);
            

        }

        Iterator<Object> ditr=ll.descendingIterator();
        while(ditr.hasNext())
        {
            Integer i5=(Integer) ditr.next();
            System.out.println("Printing in Reverse Order :: "+i5);
        }

        ArrayList<Object> al5=new ArrayList<>();
        al5.add(1000);
        al5.add(2000);
        al5.add(3000);
        al5.add(4000);
        al5.add(5000);
        for(int i=0;i<al5.size();i++)
        {
            System.out.println(al5);
            //al5.add(6000);
        }

        CopyOnWriteArrayList<Object> cowaL=new CopyOnWriteArrayList<Object>();
        cowaL.add(100);
        cowaL.add(200);
        cowaL.add(500);
        cowaL.add(600);
        cowaL.add(700);
        Iterator itr6=cowaL.iterator();
        while(itr6.hasNext())
        {
            System.out.println(itr6.next());
            cowaL.add(800);
        }


        





     
            
        
    }
    
}
