package lesson08.fraction;

public class Fraction {
  private final int num;
  private final int den;

  public static Fraction from(String origin) {
    try {
      String[] parts = origin.split("/");
      int num = Integer.parseInt(parts[0]);
      int den = Integer.parseInt(parts[1]);
      return new Fraction(num, den);
    } catch (RuntimeException ex) {
      throw new IllegalArgumentException(String.format("no way to create Fraction instance from the given data:%s", origin));
    }
  }

  public Fraction(int num, int den) {
    this.num = num;
    this.den = den;
  }

  public int num() {
    return num;
  }

  public int den() {
    return den;
  }

  @Override
  public String toString() {
    return String.format("%d/%d", num, den);
  }
}
