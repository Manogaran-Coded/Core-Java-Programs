import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHashSet {
    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(35);
        hs.add(65);
        System.out.println(hs);
        LinkedHashSet<Object> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(10);
        lhs.add(35);
        lhs.add(65);
        System.out.println(lhs);
    }
    
}
