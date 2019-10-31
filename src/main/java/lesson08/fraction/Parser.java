package lesson08.fraction;

import java.util.function.Function;

public class Parser implements Function<String, Parsed> {
  @Override
  public Parsed apply(String origin) {
    if (origin.contains("+")) {
      String[] parts = origin.split("\\+");
      Fraction f1 = Fraction.from(parts[0]);
      Fraction f2 = Fraction.from(parts[1]);
      OpPlus op = new OpPlus();
      return new Parsed(f1, f2, op);
    } else {
      throw new IllegalArgumentException("nothing except PLUS is implemented");
    }
  }
}
