package lesson08.fraction;

import java.util.Scanner;

public class SysConsole implements Console {

  private final Scanner in = new Scanner(System.in);

  @Override
  public void putLn(Object origin) {
    System.out.println(origin);
  }

  @Override
  public String getLn() {
    return in.nextLine();
  }
}
