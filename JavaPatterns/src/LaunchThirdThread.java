class MyThread extends Thread
{
    @Override
    public void run()
    {
        
       for(int i=0;i<=5;i++)
        {
            System.out.println("Child Thread "+Thread.currentThread().getPriority());
        }
    }
}

public class LaunchThirdThread 
{
    public static void main(String[] args) 
    {
       /*  MyThread t=new MyThread();
        t.setPriority(7);   
        t.start();
         */
        MyThread t= new MyThread();
        t.setPriority(7);//line -1
        t.start();

      
        for(int i=0;i<=5;i++)
        {
            System.out.println("Main Thread "+Thread.currentThread().getPriority());
        }
    }    
}
