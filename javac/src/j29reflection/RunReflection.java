package j29reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //Case1 - To get object for  class of class
        Class c1 = Class.forName("j29reflection.Student");
        System.out.println(c1.getName());

        //Case2 - To get object for  class of class
        Student s1 = new Student("Shibaram", 30,"9999999999");
        Class c2 = s1.getClass();
        System.out.println(c2.getName());

        //Class Data by Reflection API
        //----getName() return the name of class
        System.out.println(c2.getName());

        //----getMethods() return the all public methods of current class and methods inherited from super class
        /*  Method[] mlist1 = c2.getMethods();
        for (Method m:mlist1) {
            System.out.println(m.getName());
        }*/

        //----getDeclaredMethods() return only current class public methods
        /*Method[] mlist2 =c2.getDeclaredMethods();
        for (Method m:mlist2) {
            System.out.println(m.getName());
        }*/

        //-----getMethod()
        Method m1 = c2.getMethod("userInfo",String.class);
        Object object = c2.newInstance();

        String result = (String) m1.invoke(object,"JavaBing");
        System.out.println(result);



    }
}
