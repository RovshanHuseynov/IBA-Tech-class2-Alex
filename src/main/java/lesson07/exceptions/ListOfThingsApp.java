package lesson07.exceptions;

public class ListOfThingsApp {

  public static void main(String[] args) {
    ListOfThings3_Java app = new ListOfThings3_Java();
    Holder holder = app.calcSum("1 2 3 hello world");




  }

  public int calcSum(String origin) {
    if (origin == null) return 0;
    String[] split = origin.split(" ");
    int total = 0;
    for (int i=0; i<split.length; i++) {
      try {
        total += Integer.parseInt(split[i]);
      } catch (NumberFormatException ignore) {}
    }
    return total;
  }

}
