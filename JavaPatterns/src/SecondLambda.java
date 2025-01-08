@FunctionalInterface
interface Lamb1
{
    void add(int a,int b);
}

@FunctionalInterface
interface Lamb2
{
    int sub(int d);
}

public class SecondLambda {
    public static void main(String[] args) {
        Lamb1 l1=(a,b)-> { 
            int c=a+b;
            System.out.println("The Value is ::"+c);
        };
        l1.add(10,20);
        Lamb2 l2=d ->d-5;
    //int res=d-25;
    System.out.println(l2.sub(10));
    }
    

};
    

    

