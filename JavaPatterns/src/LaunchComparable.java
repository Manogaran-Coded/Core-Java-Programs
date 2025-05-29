import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

public class LaunchComparable{
    public static void main(String[] args) 
    {
        //Comparator<Integer> cr=new Comparator<Integer>() 
        Comparator<Student> com=new Comparator<Student>() 
        {

            @Override
           // public int compare(Integer i, Integer j) {
              public int compare(Student i, Student j)
              {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'compare'");
                if(i.age>j.age)
                {
                    return 1;
                }
                else{
                    return -1;
                }


            }
/* 
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }*/
            
        };
        /* 
        List<Integer> al=new ArrayList<>();
        al.add(37);
        al.add(22);
        al.add(11);
        al.add(70);
        Collections.sort(al,cr);
        System.out.println(al);*/
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(23, "Mano"));
        studs.add(new Student(22, "Meghna"));
        studs.add(new Student(21, "Riaan"));
        studs.add(new Student(20, "Ayaan"));
       Collections.sort(studs,com);
        for(Student s:studs)
            System.out.println(s);


    }
    
}
