package lesson20.calc;

public class Calc20 {
  static int do_op(int op1, int op2, String ops) {
    int r = -13;
    switch (ops) {
      case "plus" : r=op1 + op2; break;
      case "minus": r=op1 - op2; break;
      case "mult" : r=op1 * op2; break;
      case "div"  : r=op1 / op2; break;
    }
    return r;
  }
}
