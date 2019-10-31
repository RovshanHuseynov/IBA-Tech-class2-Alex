package lesson08.fraction;

import java.util.Scanner;

public class Console {

  private final Scanner in = new Scanner(System.in);

  public void putLn(Object origin) {
    System.out.println(origin);
  }

  public String getLn() {
    return in.nextLine();
  }
}
