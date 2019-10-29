package lesson07.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExApp02 {
  public static void main(String[] args)  {
    try {
      File file = new File("1.txt");
      FileReader reader = null;
      reader = new FileReader(file);
      reader.read();
    } catch (FileNotFoundException e) {
      System.out.println(">File not found");
//      throw new MySuperCoolException("");
    } catch (IOException x) {
      System.out.println(">Smth went wrong(IO)");
    }
  }
}
