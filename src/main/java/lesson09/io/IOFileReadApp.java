package lesson09.io;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class IOFileReadApp {
  public static void main(String[] args) throws IOException {
    String fileName = "myFile.txt";
    File file = new File(fileName);
    FileReader fr = new FileReader(file);
    // way 1
    Scanner file_scanner = new Scanner(fr);
    Scanner console_scanner = new Scanner(System.in);
    String line = file_scanner.nextLine();
    // way 2
    BufferedReader br = new BufferedReader(fr);
    Stream<String> contents = br.lines();
    contents.forEach(s -> System.out.printf("line: %s\n", s));


  }
}
