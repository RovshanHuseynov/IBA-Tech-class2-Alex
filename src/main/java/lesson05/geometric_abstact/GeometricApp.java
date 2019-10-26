package lesson05.geometric_abstact;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class GeometricApp {
  public static void main(String[] args) {
    ArrayList<Figure> figures = new ArrayList<Figure>();
//    Figure[] figures2 = new Figure[4];
    figures.add(new Circle());
    Figure figure = figures.get(0);
    figures.add(new Rectangle());
    figures.add(new Square());
    figures.add(new Triangle());

//    for (int i = 0; i < figures.size(); i++) {
//      total_area += figures.get(i).area();
//    }

    int total_area = 0;

    for (Figure f: figures) {
      total_area += f.area();
    }

    int[] total = {0};

    figures.forEach(f -> total[0] += f.area());

    figures.forEach(new Consumer<Figure>() {
      @Override
      public void accept(Figure f) {
        total[0] += f.area();
      }
    });

    Consumer<Figure> consumer = new Consumer<Figure>() {
      @Override
      public void accept(Figure f) {
        total[0] += f.area();
      }
    };
    Consumer<Figure> consumer4 = (Figure f) -> { total[0] += f.area(); };
    Consumer<Figure> consumer2 = f -> total[0] += f.area();
    Consumer<Figure> consumer3 = (Figure f) -> total[0] += f.area();

    figures.forEach(consumer);


    System.out.println(total_area);
    System.out.println(total[0]);







    for (int i = 0; i < 10; i++) {
      figures.add(RndFig.value());
    }

    Circle c1 = new Circle(new Point(1, 1), 7);
    Circle c2 = new Circle(new Point(1,1), 7);
    if (c1.equals(c2)) {

    }

    System.out.printf("Total square is:%d\n", total[0]);

    Collections.sort(figures,
        (o1, o2) -> o1.area() - o2.area());
    figures.forEach(f -> System.out.println(f));

  }
}
