package lesson23.warmup;

import java.util.stream.Collectors;

public class GetRidOfDuplicates {

  private static String filter(final String origin) {
    return origin.chars()
        .distinct() // Stream<int>
        .mapToObj(i -> (char)i)
        .map(String::valueOf)
        .collect(Collectors.joining());
  }

  public static void main(String[] args) {
    String toFilter = "abcdeeff";
    String filtered = filter(toFilter);
    System.out.println(filtered);
  }
}
