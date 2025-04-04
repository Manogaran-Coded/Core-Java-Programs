import java.util.*;

class Student
{
    private String name;
    private int age;
    private int marks;
    Student(String name, int age, int marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
  

    /*public String toString() {
        return "Student{name='" + name + "', age=" + age + ", marks=" + marks + "}";
    }*/

    public String toString()
    {
        return name + " " + age + " " + marks;
    }

   
}

public class LaunchGen {
    public static void main(String[] args) {
        Student s1=new Student("Mano", 30, 99);
        Student s2=new Student("Riaan", 9, 100);
        Student s3=new Student("Meghna", 30, 100);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /* 
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        @SuppressWarnings("rawtypes")
        Iterator itr=al.iterator();
        
        while(itr.hasNext())
        {
            System.out.println("Iterator"+itr.next());
        }*/

        HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
        hm.put(1,s1);
        hm.put(2,s2);
        hm.put(3,s3);
        System.out.println(hm);

        
   
        
    }
    
}
