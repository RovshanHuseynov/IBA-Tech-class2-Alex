package lesson23.reflection;

public class Point2D {
  private final int x;
  private final int y;

  public Point2D() {
    this(-1,-2);
  }

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String representation(int extra) {
    return String.format("%d:[%d:%d]",extra,x,y);
  }

  public String representation() {
    return String.format("[%d:%d]",x,y);
  }

  @Override
  public String toString() {
    return representation();
  }

  public void printMe() {
    System.out.println(representation());
  }
}
