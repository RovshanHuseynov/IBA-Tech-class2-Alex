package lesson07.exceptions;

public class ExApp04 {

  static int divide(int a, int b) {
    if (b == 0) throw new MyCoolException("is not allowed");
    return a / b;
  }

  public static void main(String[] args) {
    int r = divide(5, 0);
    System.out.println(r);
  }
}
