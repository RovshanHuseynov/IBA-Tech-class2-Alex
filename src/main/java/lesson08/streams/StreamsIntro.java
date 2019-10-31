package lesson08.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntro {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(5);

//    ArrayList<Integer> filtered = new ArrayList<>();
//    list.forEach((Integer my_item) -> {
//      if (my_item>2) filtered.add(my_item);
//    });

    List<String> collected = list.stream()
        .filter(item -> item > 2) // 3,5
        .map(element -> element * 2) // "aa6bb","aa10bb"
        .collect(Collectors.toList());

    collected.forEach(item -> System.out.println(item));


  }
}
