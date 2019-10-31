package lesson08.fraction;

import java.util.function.Function;

public class Simplify implements Function<Fraction, Fraction> {
  @Override
  public Fraction apply(Fraction fraction) {
    return fraction;
  }
}
