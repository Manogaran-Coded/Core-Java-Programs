import java.util.Scanner;

enum Course
{
    JAVA, JEE, SpringBoot, React;
    int Course_Id;

    public void setCourseId(int Course_Id )
    {
        this.Course_Id=Course_Id;
    }
    int getCourseId()
    {
        return Course_Id;
    }

}
public class LaunchEnumpractice {
    public static void main(String[] args) {
        Course.JAVA.setCourseId(10);
        Course.JEE.setCourseId(20);
        Course.SpringBoot.setCourseId(30);
        Course.React.setCourseId(40);
        Course crs1[]=Course.values();
       // int cid[]=(int) Course.JAVA.getCourseId();
       System.out.print("Enter the Course Id:: ");
       Scanner scan=new Scanner(System.in);
       Integer itr=scan.nextInt();
       boolean found=false;
        for(Course crs:crs1)
        {
            if(itr== crs.getCourseId())
            {
                System.out.println("Course Id is:: "+itr +" & Course Name is :: "+crs.name());
                found=true;
                break;
            }
            
            //System.out.println(crs.ordinal()+ " " +crs);
        }
        if(!found)
            {
                System.out.println("The Course Id you entered is not found:: "+itr);
            }

        
    }
    
}
