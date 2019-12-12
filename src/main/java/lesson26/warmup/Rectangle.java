package lesson26.warmup;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Rectangle {
  public final Point a;
  public final Point b;

  public static Rectangle rnd() {
    return new Rectangle(Point.rnd(), Point.rnd());
  }

  public Rectangle(Point a, Point b) {
    this.a = a;
    this.b = b;
  }

  public int left() {
    return Math.min(a.x, b.x);
  }

  public int right() {
    return Math.max(a.x, b.x);
  }

  public int top() {
    return Math.min(a.y, b.y);
  }

  public int bottom() {
    return Math.max(a.y, b.y);
  }

  public Stream<Integer> x_range() {
    return IntStream.rangeClosed(left(), right()).boxed();
  }

  public Stream<Integer> y_range() {
    return IntStream.rangeClosed(top(), bottom()).boxed();
  }

  public Stream<Point> points() {
    return x_range().flatMap(x -> y_range().map(y -> Point.of(x,y)));
  }

}
