package lesson08;

public class EncodingApp {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Привет";
    String s3 = "Əliyev";
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s3.length());
    System.out.println(s1.getBytes().length);
    System.out.println(s2.getBytes().length);
    System.out.println(s3.getBytes().length);
    for (byte b: s3.getBytes()) {
      System.out.printf(" %x", b);
    }
  }
}
