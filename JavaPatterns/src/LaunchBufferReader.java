import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025/demo.txt");
        BufferedReader br=new BufferedReader(fr);
        //System.out.println(fr.read());
        int i=fr.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr.read();
        }
        br.close();
        
    }
    
}
