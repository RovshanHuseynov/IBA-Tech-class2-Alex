package lesson26.warmup;

public class Point {
  public final int x;
  public final int y;

  public static Point rnd() {
    return Point.of(Fn.rnd(), Fn.rnd());
  }

  public static Point of(int x, int y) {
    return new Point(x, y);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Point)) return false;
    Point that = (Point) o;
    return (that.x == this.x) && (that.y == this.y);
  }

  @Override
  public int hashCode() {
    return x << 16 + y;
  }
}
