package lesson07.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExApp02 {
  public static void main(String[] args)  {
    File file = new File("1.txt");
    FileReader reader = null;

    try {
      reader = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println(">File not found");
    }
    //reader.read();

  }
}
