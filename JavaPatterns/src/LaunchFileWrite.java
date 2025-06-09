import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileWrite {
    public static void main(String[] args) throws IOException 
    {
        String location="/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025";
        File f=new File(location,"demo.txt");

        FileWriter fw=new FileWriter(f,true);
        fw.write(97);
        fw.write("\n");
        fw.write("Mano Created the File");
        fw.write("\n");
        char[] ch={'a','b','c','d'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();
        System.out.println("Open the File demo.txt");
    }
    
}
