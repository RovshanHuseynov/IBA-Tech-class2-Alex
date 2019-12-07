package lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExplanation {
  public static void main(String[] args) {
    Optional<Integer> optI = Optional.ofNullable(null);
    Optional<String> optS = optI
        .map(x -> x + 1)
        .map(x -> x * 2)
        .map(x -> x + "!")
        .map(x -> String.format("<a href=\"%s\">Link</a>", x));
//    String result0 = optS.get(); // problem if null
    String result1 = optS.orElse("");
    System.out.println(result1);
//    String result2 = optS.orElseThrow(() -> new IllegalArgumentException("no value"));

//    ANTI-PATTERN. DONT DO THAT
//    String s = "";
//    if (s1.isPresent()) {
//      s = s1.get();
//    }
  }
}
