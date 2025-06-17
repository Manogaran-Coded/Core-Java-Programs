import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchFindBigString {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new FileReader("stringdata.txt"));
        String data=br.readLine();
        int maxlength=0;
        String result="";
        while(data!=null)
        {
            int resultData=data.length();
            if(maxlength<resultData)
            {
                maxlength=resultData;
                result=data;
                
            }
            data=br.readLine();
        }
        System.out.println(maxlength);
        System.out.println(result);
    }
    
}
