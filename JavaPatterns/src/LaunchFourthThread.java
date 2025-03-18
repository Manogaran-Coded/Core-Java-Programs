class Display
{
public void wish(String Name)
{


    synchronized(this)
    {
        for(int i=0;i<=5;i++)
        {
            System.out.print("Good Morning:: ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Error Occure"+ie);
            }
            System.out.println(Name);
        }
    }
}

}
class MyThread extends Thread
{

    Display d;
    String Name;
    MyThread(Display d, String Name)
    {
        this.d=d;
        this.Name=Name;
    }
    @Override
    public void run()
    {
        d.wish(Name);
    }
}


public class LaunchFourthThread 
{
    public static void main(String[] args) 
    {
        Display d= new Display();
        MyThread t1=new MyThread(d,"yuvi");
        MyThread t2=new MyThread(d,"Dhoni");
        t1.start();
        t2.start();

    }
}
