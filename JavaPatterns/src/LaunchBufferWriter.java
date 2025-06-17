import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025/demo.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(98);
        bw.write("Helo");
        bw.newLine();
        char ch[]={'H','O','M','E'};
        bw.write(ch);
        bw.write("Take Care");
        bw.flush();
        bw.close();
        System.out.println("Open the DEMO file");

    }
    
}
