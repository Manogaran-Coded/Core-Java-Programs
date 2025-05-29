import java.util.Collection;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class information
{
    private String name;
    private String city;
    private int age;
    information(String name, String city, int age)
    {
        this.name=name;
        this.city=city;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }
    public String toString()
    {
        return name +" " + city + " " + age;
    }
    
   
    
}


public class LaunchMap {
    
    public static void main(String[] args) {
        information info1=new information("Rahul Srivastav", " Delhi", 28);
        information info2=new information("Vijay Kumar", " Bengaluru", 18);
        information info3=new information("Krishnan Arumugam", " Chennai", 48);
        //HashMap<Integer,information> hm=new HashMap<Integer,information>();
        HashMap<Integer,information> hm=new HashMap<Integer,information>();
        hm.put(1,info1);
        hm.put(2,info2);
        hm.put(3,info3);
        System.out.println(hm);
        Collection c=hm.values();
        Iterator itr=c.iterator();
        while(itr.hasNext())
        {
            System.out.println("Value of Student"+itr.next());
        }
        Set se=hm.keySet();
        Iterator itr1=se.iterator();
        while(itr1.hasNext())
        {
            System.out.println("Only Key :: "+itr1.next());
        }
        Set setboth=hm.entrySet();
        Iterator itr2=setboth.iterator();
        while(itr2.hasNext())
        {
            //System.out.println("Both the Data:: "+itr2.next());
            Map.Entry data=(Entry) itr2.next();
            System.out.println(data.getKey() + ":" + data.getValue());
        }
        

        
    }
}
