package lesson09.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOSimpleWriteApp {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(
        new FileWriter(
            new File("data/_1234567890.txt")));
    // -------------
    bw.write("Hello! I found it");
    // -------------
    bw.close();
  }
}
