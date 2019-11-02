package lesson09.io;

import java.io.*;

public class IOSimpleReadApp {
  public static void main(String[] args) throws IOException {
    BufferedReader bw = new BufferedReader(
        new FileReader(
            new File("data/_1234567890.txt")));
    String line = bw.readLine();
    // -------------
    System.out.println(line);
    // -------------
    bw.close();
  }
}
