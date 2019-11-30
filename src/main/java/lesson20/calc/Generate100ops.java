package lesson20.calc;

import lesson19.db.DbOps;

import java.util.Arrays;
import java.util.List;

public class Generate100ops {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      generateOp();
    }
  }

  private static void generateOp() {
    List<String> ops = Arrays.asList("plus", "minus", "mult", "div");
    int op1 = (int) (Math.random()*100);
    int op2 = (int) (Math.random()*100);
    String op = ops.get((int) (Math.random() * 4));
    int user = (int) (Math.random()*10);
    int r = Calc20.do_op(op1, op2, op);
    DbOps.insert_op(op1, op2, op, r, user);
  }
}
