import java.util.LinkedList;

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll=new LinkedList<>();
        ll.add(24);
        ll.add(35);
        ll.add(45);
        ll.add("Mano");
        System.out.println("Display List:: "+ll);
        ll.addFirst(10);
        System.out.println(ll);
        ll.addLast(100);
        System.out.println(ll);
        ll.add(2,99);
        System.out.println(ll);
        ll.addAll(ll);
        System.out.println(ll);

    }
    
}
