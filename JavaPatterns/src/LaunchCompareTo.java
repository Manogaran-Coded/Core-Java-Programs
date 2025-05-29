import java.util.TreeSet;

public class LaunchCompareTo {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("A");
        ts.add("Z");
        ts.add("B");
        ts.add("k");
        //ts.add(null);
        System.out.println("A".compareTo("Z"));
        System.out.println("B".compareTo("Z"));
    }
    
}
