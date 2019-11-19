package lesson15;

public class IsPalindromeNaive {
  boolean check(int val) {
    String s = String.valueOf(val);
    return s.equals(new StringBuilder(s).reverse());
  }
}
