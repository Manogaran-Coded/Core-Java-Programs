import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileReadLength {
    public static void main(String[] args) throws IOException {
        File f=new File("/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025/demo.txt");
        FileReader fw=new FileReader(f);
        char[] ch=new char[(int)f.length()];
        fw.read(ch);
        for(char data:ch)
            System.out.print(data);
        fw.close();
        
    }
    
}
