package lesson09.io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOBaseIdeaApp {
  public static void main(String[] args) {
    InputStream in = System.in;
    PrintStream out = System.out;

    Scanner scanner = new Scanner(in);
    out.println();
  }
}
