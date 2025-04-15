//import java.util.Collection.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.util.Map;
import java.util.Map.*;


class Employee
{
    private int age;
    private int Emp_No;
    private String address;
    private String City;

   
    Employee(int age, int Emp_No, String address, String City)
    {
        this.age=age;
        this.Emp_No=Emp_No;
        this.address=address;
        this.City=City;

    }

    public int getAge() {
        return age;
    }

    public int getEmp_No() {
        return Emp_No;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return City;
    }

    public String toString()
    {
        return age + " " + Emp_No + " " + address + " " + City;
    }
    


}


public class LaunchpracticeMap {
    public static void main(String[] args) 
    {
        Employee e1=new Employee(23, 37571, "India", "Delhi");
        Employee e2=new Employee(25, 384889, "India", "Chennai");
        Employee e3=new Employee(32, 357889, "India", "Hyderabad");
        HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
        map.put(1,e1);
        map.put(2,e2);
        map.put(3,e3);
        
        Collection col=map.values();
        Iterator itr=col.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Set set=map.entrySet();
        Iterator itr1=set.iterator();
        while(itr1.hasNext())
        {
            Map.Entry etr=(Entry) itr1.next();
            System.out.println("Key Value is:: "+etr.getKey() + "\n"+"Employe Data is:: "+etr.getValue());
        }

        

    }
    
}
