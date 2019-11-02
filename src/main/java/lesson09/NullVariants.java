package lesson09;

import java.util.ArrayList;
import java.util.Optional;

public class NullVariants {
  public static void main(String[] args) {
    String s = null;
    if (s != null) {
      s.toLowerCase();
    }

    ArrayList<String> list = new ArrayList<>();
    list.forEach(x -> x.toLowerCase());

    Optional<String> opt_str = Optional.ofNullable(s)
        .map(z -> z.toLowerCase());

    String str = opt_str
        .orElse(">> no val <<");


  }
}
