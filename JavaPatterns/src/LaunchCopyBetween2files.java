import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchFindDuplicates {
    public static void main(String[] args) throws IOException 
    {
        //FileReader fr=new FileReader("file1.txt");
        PrintWriter pw=new PrintWriter("file3.txt");
        BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
        String line1=br1.readLine();

        BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
        String line2=br2.readLine();
        while(line1!=null|| line2!=null)
        {
            if(line1!=null)
            {
                pw.println(line1);
                line1=br1.readLine();
            }
            if(line2!=null)
            {
                pw.println(line2);
                line2=br2.readLine();
            }
            
        }
        pw.flush();
       // pw.close();
        br1.close();
        br2.close();
        pw.close();
    }
    
}
