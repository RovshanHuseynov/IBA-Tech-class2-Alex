package lesson23.warmup;

public class GetRidOfDuplicates {

  private static String filter(final String toFilter) {
    return toFilter;
  }

  public static void main(String[] args) {
    String toFilter = "abcdeeff";
    String filtered = filter(toFilter);
    System.out.println(filtered);
  }
}
