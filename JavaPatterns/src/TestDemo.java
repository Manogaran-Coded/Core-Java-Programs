import java.lang.reflect.InvocationTargetException;

class Demo{
    static{
        System.out.println("Static Blocl executed");
    }
    public Demo(){
        System.out.println("Constructor is executed");
    }
}

public class TestDemo
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
      // System.out.println("Hello World");
      String className=args[0];
      Class<?> c=Class.forName(className);
      Object obj=c.getDeclaredConstructor().newInstance();
    }
}