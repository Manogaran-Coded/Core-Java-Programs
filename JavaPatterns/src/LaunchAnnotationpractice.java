import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    String Country();
    int runs();
}
@CricketPlayer(Country = "India", runs = 5000)
class Viratkohli
{
    private int innings;
    private String name;
    public void setInnings(int innings)
    {
        this.innings=innings;
    }
    public int getInnings()
        {
            return innings;
        }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
public class LaunchAnnotationpractice {
    public static void main(String[] args) 
    {
        Viratkohli vk=new Viratkohli();
        //vk.setInnings(500);
        //vk.setName("Virak Kohli");
       // System.out.println(vk.getInnings());
        //System.out.println(vk.getName());

        Class<?> c=vk.getClass();
        Annotation an=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp=(CricketPlayer)an;
        int run=cp.runs();
        System.out.println(run);
        String cn=cp.Country();
        System.out.println(cn);

        
    }
    
}
