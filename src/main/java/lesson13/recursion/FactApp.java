package lesson13.recursion;

public class FactApp {

  public int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n-1);
  }

  public static void main(String[] args) {
    FactApp app = new FactApp();
    int F6 = app.fact(6);
    System.out.println(F6);
  }
}
