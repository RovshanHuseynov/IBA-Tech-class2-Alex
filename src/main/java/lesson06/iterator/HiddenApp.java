package lesson06.iterator;

import java.util.Iterator;

public class HiddenApp {
  public static void main(String[] args) {
    HiddenData months = new HiddenData();

    for (String month: months) {
      System.out.println(month);
    }

    Iterator<String> it = months.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
