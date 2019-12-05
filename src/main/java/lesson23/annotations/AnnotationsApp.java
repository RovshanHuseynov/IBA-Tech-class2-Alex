package lesson23.annotations;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class AnnotationsApp {
  public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    Reflections r = new Reflections(new ConfigurationBuilder()
        .setScanners(new SubTypesScanner(false), new ResourcesScanner())
        .addUrls(ClasspathHelper.forJavaClassPath())
        .filterInputsBy(new FilterBuilder()
            .include(FilterBuilder
                .prefix("lesson23/annotations")))
    );
    Set<Class<?>> classes = r.getSubTypesOf(Object.class);
    for (Class<?> clazz: classes) {
      if (clazz.isAnnotationPresent(Ready.class)) {
        Ready an = clazz.getAnnotation(Ready.class);
        if (an.value() > 50) {
          System.out.println(clazz);
          Method[] methods = clazz.getMethods();
          for (Method m: methods) {
            if (m.isAnnotationPresent(Meaningful.class)) {
              System.out.println(m);
              Constructor<?> constr = clazz.getConstructor();
              Object o = constr.newInstance();
              m.invoke(o);
            }
          }
        }
      }
    }
  }
}
