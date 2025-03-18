class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
            {   
                {
                    System.out.println("My Child Thread");
                }
            }
    }   
}

public class LaunchSecondThread {
    
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();

        //mr.run();
        Thread t=new Thread(mr);
       t.start();
        for(int i=0;i<=10;i++)
        {
            System.out.println("My Parent Thread");
        }
    }
}
