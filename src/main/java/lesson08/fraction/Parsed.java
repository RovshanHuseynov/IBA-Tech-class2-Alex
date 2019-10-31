package lesson08.fraction;

public class Parsed {
  private Fraction op1;
  private Fraction op2;
  private Operation operation;

  public Parsed(Fraction op1, Fraction op2, Operation operation) {
    this.op1 = op1;
    this.op2 = op2;
    this.operation = operation;
  }

  public Fraction run() {
    return operation.apply(op1, op2);
  }
}
