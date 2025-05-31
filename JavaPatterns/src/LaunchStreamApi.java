import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LaunchStreamApi {
    public static void main(String[] args) {
        
        List<Integer> li=Arrays.asList(4,3,1,0,9,5,8,9,10,14);
        int sum=0;

        Stream<Integer> str=li.stream();
        System.out.println(str);
        str.forEach(n->System.out.println(n));

        //Consumer<Integer> con=t -> System.out.println(t);
        //li.forEach(con);

        //li.forEach(n -> System.out.println(n));

        // for(int i=0;i<li.size();i++)
        // {
        //     if(li.get(i)%2==0)
        //     {
        //         int n=li.get(i);
        //         n=n*2;
        //         sum=sum+n;
                
        //     }
        //     //System.out.println(li.get(i));
            
        // }
        // System.out.println(sum);
        // for(int n:li)
        // {
        //     if(n%2==0)
        //     {
        //         n=n*2;
        //         sum=sum + n;
        //         //8+16+20+28
        //     }
        // }
        // System.out.println(sum);

    }
    
}
