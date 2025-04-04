import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

class PassportInformation
{
    private String FirstName;
    private String LastName;
    private String FatherFullName;
    private int age;
    private int DOB;
    private String city;
    private String Country;
    
    public PassportInformation(String firstName, String lastName, String fatherFullName, int age, int dOB, String city,
            String country) {
        FirstName = firstName;
        LastName = lastName;
        FatherFullName = fatherFullName;
        this.age = age;
        DOB = dOB;
        this.city = city;
        this.Country = country;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getFatherFullName() {
        return FatherFullName;
    }
    public int getAge() {
        return age;
    }
    public int getDOB() {
        return DOB;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return Country;
    }
    public String toString()
    {
        return FirstName + " "+LastName+ " "+FatherFullName+" "+age+" "+DOB+" "+city+" "+Country;
    }
  
    
}


public class LaunchPassport {
    public static void main(String[] args) 
    {
        PassportInformation pi=new PassportInformation("Manogaran", "Subramani Ashokan", "Ashokan N.S", 28, 05/10/1984, "Chennai", "India");
        HashMap<Integer,PassportInformation> hm=new HashMap<Integer,PassportInformation>();
        hm.put(1, pi);
        //System.out.println(hm);
        System.out.println("Enter the Passport Number:: ");
        Scanner scan=new Scanner(System.in);
        Integer k=scan.nextInt();

        Set set1=hm.keySet();
        Iterator itr=set1.iterator();
        while(itr.hasNext())
        {
           // System.out.println("Key is :: "+itr.next());
            itr.next();
        }

        Collection col=hm.values();
        Iterator itr1=col.iterator();
        while(itr1.hasNext())
        {
            //System.out.println("Only Values:: "+itr1.next());
            itr1.next();
        }
        Boolean flag=false;
        
        Set setbothdata=hm.entrySet();
        Iterator itr2=setbothdata.iterator();
        while(itr2.hasNext())
        {
            Map.Entry data=(Entry)itr2.next();
            //System.out.println(data.getKey() +": " + data.getValue());
            Integer key=(Integer) data.getKey();
            if(k==key)
            {
                flag=true;
                System.out.println("Passport Found");
                System.exit(0);
            }
          

        }
        if(flag==false)
        {
            System.out.println("Passport not Found!!! Please Enter the Correct Details");
        }
        
        
        

    }
    
}
