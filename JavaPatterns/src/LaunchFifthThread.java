class ThreadB extends Thread
{
    int total=0;
   // @Override
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Thread Started the Execution");
            for(int i=0;i<=100;i++)
            {
                total+=i;
            }
            System.out.println("Child Thread give Notification Call");
            this.notify();
        }
    }   

}



public class LaunchFifthThread 
{
    public static void main(String[] args) throws Exception
    {
        ThreadB b=new ThreadB();
        b.start();
        synchronized(b)
        {
            System.out.println("Calling Main Thread");
            b.wait();
            System.out.println("Child Thread giving Notification call");
            System.out.println(b.total);
        }
        
    }

    
}
