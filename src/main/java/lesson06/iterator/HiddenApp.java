package lesson06.iterator;

public class HiddenApp {
  public static void main(String[] args) {
    HiddenData months = new HiddenData();

    for (String month: months) {
      System.out.println(month);
    }

  }
}
