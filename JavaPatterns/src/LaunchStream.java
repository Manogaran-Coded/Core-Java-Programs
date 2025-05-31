import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(5,6,7,8);
        // Stream<Integer> str=li.stream();
       
        // Stream<Integer> str1=str.filter(a->a%2==0);
        // Stream<Integer> str2=str1.map(a->a*2);
        // //int result=str2.reduce(identity, c,e);
        // int str3=str2.reduce(0,(c,e)-> c+e);
        // //str2.forEach(a->System.out.println(a));


        // //Stream<Integer> result=str.filter(a->a%2==0);
        // System.out.println(str3);
        int result=li.stream()
                    .filter(a->a%2==0)
                    .map(a->a*2)
                    .reduce(0,(c,e)->(c+e));
        System.out.println(result);

    }
    
}
