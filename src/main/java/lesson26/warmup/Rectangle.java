package lesson26.warmup;

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
}
