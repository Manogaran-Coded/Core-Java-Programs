/*
New is an operator to created an objects, if we know class name at the beginning then we can created an object by using new operator

newInstance() is a method to presenting class "Class" , which can be used to create object

if we dont know the class name at the beginning and its available dynamically runtime then we should go for newInstance() metod

*/

package DemoNewInstance;

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