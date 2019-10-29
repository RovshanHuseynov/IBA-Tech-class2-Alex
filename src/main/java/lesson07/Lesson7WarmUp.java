package lesson07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson7WarmUp {
  public static void main(String[] args) {
    List<Integer> origin = Stream
        .generate(() -> (int) (Math.random() * 100))
        .limit(30).collect(Collectors.toList());
    ArrayList<Integer> sorted = new ArrayList<>(origin);

    Comparator<Integer> super_comparator =
        (i1, i2) -> {
          if (i1 < i2) return -1;
          else if (i2 < i1) return 1;
          return 0;
    };

    Collections.sort(sorted, super_comparator);

    System.out.println(origin);
    System.out.println(sorted);
  }
}
