class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("My Child Thread");
        }
    }
}

public class LaunchFirstThread {
    public static void main(String[] args) 
    {
        MyThread t=new MyThread();
        t.run();
        for(int i=0;i<10;i++)
        {
            System.out.println("My Main Thread");
        }
        
    }
    
}
