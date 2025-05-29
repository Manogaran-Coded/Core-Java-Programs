import java.util.ArrayList;

public class LaunchGeneric {
    public static void main(String[] args) {
        ArrayList<? extends Number> ar=new ArrayList<Number>();
        System.out.println(ar.size());
    }
    
}
