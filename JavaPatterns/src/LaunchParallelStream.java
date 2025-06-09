import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LaunchParallelStream {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> li=new ArrayList<>(size);
        Random ran=new Random();
        for(int i=0;i<=size;i++)
        {
            li.add(ran.nextInt(100));
        }
        long startSeq= System.currentTimeMillis();
       int sum=li.stream()
                    .map(i->i*2)
                    .reduce(0,(c,e)->c+e);
        long endSeq=System.currentTimeMillis();
        System.out.println("Regular Stream End Time:: "+(endSeq-startSeq));
        long startParallelSeq= System.currentTimeMillis();
       //int sum=li.stream()
        int sum1=li.stream()
                    .map(i->i*2)
                    .mapToInt(i->i)
                    .sum();
        long endParallelSeq=System.currentTimeMillis();
        System.out.println("Parallel Stream End Time:: "+(endParallelSeq-startParallelSeq));
        System.out.println(sum);
        System.out.println(sum1);
    }
}
