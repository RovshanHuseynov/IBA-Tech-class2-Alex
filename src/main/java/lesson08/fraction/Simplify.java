package lesson08.fraction;

import java.util.function.Function;

public class Simplify implements Function<Fraction, Fraction> {

  private int gcd(int one, int two) {
    return 1;
  }

  @Override
  public Fraction apply(Fraction origin) {
    int num = origin.num();
    int den = origin.den();
    int gcd = gcd(num, den);
    if (gcd != 1) {
      return new Fraction(num/gcd, den/gcd);
    }
    return origin;
  }
}
