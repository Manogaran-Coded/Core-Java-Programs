class Employee implements AutoCloseable
{
    private String eName;
    private int empId;

    public String toString()
    {
        return "Mano";
    }
    @Override
    public void close()
    {
        System.out.println("Garbage Collector collected");
    }

}


public class LaunchGC {
    public static void main(String[] args) {
        try{
            Employee e=new Employee();
            
            System.out.println(e);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
        System.gc();
        
    }

}
