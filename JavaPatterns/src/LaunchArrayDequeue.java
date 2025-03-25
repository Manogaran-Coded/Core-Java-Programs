import java.util.ArrayDeque;

public class LaunchArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Object> ad=new ArrayDeque<>();
        ad.add(20);
        ad.add(25);
        ad.add(20);
        System.out.println(ad);
        
        System.out.println(ad.peekFirst());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
    }
    
}
