import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchFindDuplicates 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw=new PrintWriter("output.txt");
        String target=br.readLine();
        while(target!=null)
        {
            Boolean isAvailable=false;
            BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
            String line=br1.readLine();
            //System.out.println("Line:: "+line);
            while(line!=null)
            {
                if(line.equals(target))
                {
                    isAvailable=true;
                    break;

                }
                line=br1.readLine();
            }
            
            if(isAvailable==false)
            {
                    pw.println(target);
                    pw.flush();
            }
            target=br.readLine();
        }
            
            br.close();
            pw.close();
            
        
    }
}