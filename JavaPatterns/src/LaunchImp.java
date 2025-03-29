import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

     
            
        
    }
    
}
