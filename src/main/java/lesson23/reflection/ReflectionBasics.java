package lesson23.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionBasics {
  public static void main(String[] args) throws
      ClassNotFoundException, IllegalAccessException,
      InstantiationException, NoSuchMethodException,
      InvocationTargetException {
    String class_name = "lesson23.reflection.Point2D";
    Class<?> aClass = Class.forName(class_name);
    Constructor<?>[] constructors = aClass.getConstructors();
    for (Constructor c: constructors) {
      System.out.println(c);
    }
    Constructor<?> constructor = aClass.getConstructor(int.class, int.class);
    Object o = constructor.newInstance(11, 22);
//    Object o = aClass.newInstance();
    System.out.println(o.toString());
    if (o instanceof Point2D) {
      Point2D p = (Point2D) o;
      p.printMe();
    }
    System.out.println("=====================");
    Method[] methods = aClass.getMethods();
    for (Method m: methods) {
      if (m.getReturnType() == String.class) {
//        String outcome = (String)m.invoke(o);
//        System.out.println(outcome);
        System.out.println(m);
      }
    }
    System.out.println("=====================");
    for (Method m: methods) {
      if (m.getReturnType() == String.class) {
        if (m.getParameterCount() == 1) {
          Class<?>[] parameterTypes = m.getParameterTypes();
          if (parameterTypes[0] == int.class)
            System.out.println(m.invoke(o, 77));
        }
      }
    }

  }
}
