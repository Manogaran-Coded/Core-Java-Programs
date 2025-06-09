import java.io.File;
import java.io.IOException;

public class LaunchFileIO {
    public static void main(String[] args) throws IOException {
        String fileName="abc.txt";
        String location="/Users/manogaran.ashokan/Full-Stack-Java-Developer/JavaPatterns/src/IPL2025";
        // File fil=new File(fileName);
        // System.out.println(fil.exists());
        // fil.createNewFile();
        // System.out.println(fil.exists());
        File fil3=new File(location);
        File fil=new File("IPL2025");
        fil.mkdir();
        System.out.println("Is it Pointing to a Directory :: " +fil.isDirectory());
        File fil1=new File(fil3,fileName);
        fil1.createNewFile();
        System.out.println("Is it Pointing to a file :: " +fil1.isFile());
    }
    
}
