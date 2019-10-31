package lesson08.fraction;

public class FractionApp {
  public static void main(String[] args) {
    Console console =
        new SysConsole();
//        new MockConsole();

    String ln = console.getLn();
    Parsed parsed = new Parser().apply(ln);
    Fraction result = parsed.run();
    Fraction simplified = new Simplify().apply(result);
    console.putLn(simplified);


//    String s = (((MockConsole)console).getData().get(0)).toString();
//    System.out.println(s);
  }
}
