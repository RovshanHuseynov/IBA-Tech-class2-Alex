package lesson07.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExApp01 {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("1.txt");
    FileReader reader = new FileReader(file);
  }
}
