import java.util.*;
import java.util.Map;

public class LaunchHashMap {
    public static void main(String[] args) 
    {
        HashMap<Object,String> h1=new HashMap<Object,String>();
        h1.put(1,"Riaan");  
        h1.put(2,"Ayaan"); 
        h1.put(3,"Meghna"); 
        h1.put(4,"Mano"); 
        Collection<String> c=h1.values();
        Iterator<String> itr=c.iterator();
        while(itr.hasNext())
        {
            String str=(String)itr.next();
            System.out.println(str);
        }
    }
  
    
}
