package lesson05.geometric_abstact;

public abstract class Figure {

  abstract public int area();

  @Override
  public String toString() {
    return String.format("Figure: %s, Area: %d",
        this.getClass().getSimpleName(),
        area());
  }
}
