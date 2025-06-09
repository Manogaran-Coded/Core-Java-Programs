import java.io.File;

public class LaunchFileIODemo {
    public static void main(String[] args) 
    {
        int dirCount=0;
        int fileCount=0;
        int javafileCount=0;
        int classfileCount=0;
        String location="/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/";
        File fil=new File(location);
        String names[]=fil.list();
        if(names!=null)
        {
            for(String name:names)
            {
                File fil1=new File(fil,name);
                if(fil1.isDirectory())
                {
                    dirCount++;

                }
                else if(fil1.isFile())
                {
                    fileCount++;
                    if(name.endsWith(".java"))
                    {
                        javafileCount++;
                        System.out.println("Name is:: "+name);
                        //System.out.println("Java File Count is:: "+javafileCount);
                    }
                     else if(name.endsWith(".class"))
                     {
                         classfileCount++;
                     }
                }
                if(fil1.isFile())
                {
                    fileCount++;
                }
                //System.out.println(name);
            }
        }
        System.out.println("File Count is:: "+fileCount);
        System.out.println("Dir Count is:: "+dirCount);
        System.out.println("Java File Count is:: "+javafileCount);
        System.out.println("Class File Count is:: "+classfileCount);
       
    }

   
    
}
