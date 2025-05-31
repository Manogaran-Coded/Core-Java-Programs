import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaunchComparable {
 public static void main(String[] args) {
    int age;
   // String name;
   Comparator<Integer> com=(i,j) -> i%10>j%10?1:-1;
   
    
    List<Integer> nums=new ArrayList<>();
    nums.add(23);
    nums.add(21);
    nums.add(40);
    nums.add(02);
    Collections.sort(nums,com);
    System.out.println(nums);
 }   
}