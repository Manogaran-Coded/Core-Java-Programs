import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchPrintWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025/demo.txt");
        PrintWriter out=new PrintWriter(fw);
        out.write(100);
        out.write("Hello World");
        out.println(100);
        out.println(300);
        out.flush();
        out.close();
        System.out.println("Open the DEMO.txt File---->");
        
    }
    
}
