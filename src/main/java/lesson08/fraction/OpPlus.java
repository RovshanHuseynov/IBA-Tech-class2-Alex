package lesson08.fraction;

public class OpPlus implements Operation {
  @Override
  public Fraction apply(Fraction one, Fraction two) {
    int num1 = one.num();
    int den1 = one.den();
    int num2 = two.num();
    int den2 = two.den();
    return new Fraction(num1*den2 + num2*den1, den1*den2);
  }

}
