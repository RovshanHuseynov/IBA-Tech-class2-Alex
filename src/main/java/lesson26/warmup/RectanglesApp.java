package lesson26.warmup;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RectanglesApp {
  public static void main(String[] args) {
    Stream<Rectangle> data = Stream.generate(Rectangle::rnd).limit(Fn.rnd());
    Stream<Point> points = data.flatMap(Rectangle::points);
    int area = points.collect(Collectors.toSet()).size();
    System.out.println(area);
  }
}
