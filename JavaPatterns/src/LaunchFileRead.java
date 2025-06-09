import java.io.FileReader;
import java.io.IOException;

public class LaunchFileRead {
    public static void main(String[] args) throws IOException {
       String location="/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025/demo.txt";
        FileReader fr=new FileReader(location);
        int i=fr.read();
        System.out.println(i);
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr.read();
        }
    }
    
}
