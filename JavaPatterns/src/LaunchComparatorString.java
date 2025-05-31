/*
 * Comparator - if you want to specify which logic you want to sort the elements then we can use Comparator
 * Comparable - if you want to give a power to class itself to complile its object to itself then we can use Comparable
 * 
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Details implements Comparable <Details>
{
    int age;
    String name;
    public Details(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Details [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Details that) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
       if(this.age>that.age)
            return 1;
        else
            return -1;
    }
   

    
}

public class LaunchComparatorString {

    public static void main(String[] args) {
       /*  Comparator<Details> com=new Comparator<Details>() 
        {
            public int compare(Details i, Details j)
            {
                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }
            
        };*/
        List<Details> li=new ArrayList<Details>();
        li.add(new Details(23, "Mano"));
        li.add(new Details(10,"Sridhar"));
        li.add(new Details(18, "Suresh"));
        Collections.sort(li);
        for (Details details : li) {
            System.out.println(details);
            
        }



        
    }
    
}
