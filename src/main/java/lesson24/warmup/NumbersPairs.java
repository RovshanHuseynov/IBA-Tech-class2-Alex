package lesson24.warmup;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersPairs {
  public static void main(String[] args) {
//    Map<Integer, List<Integer>> collected =
//        Stream.generate(() -> (int) (Math.random() * 16 + 10))
//        .limit(50)
//        .collect(Collectors.groupingBy(x -> x));
//    collected.forEach((k,v) -> System.out.printf("N:%d, L:%s\n", k, v));

//    Map<Integer, Long> collected =
//        Stream.generate(() -> (int) (Math.random() * 16 + 10))
//        .limit(50)
//        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//    collected.forEach((k,v) -> System.out.printf("N:%d, L:%d\n", k, v));

//    Optional<Map.Entry<Integer, Long>> min =
    Integer goal = Stream.generate(() -> (int) (Math.random() * 16 + 10))
        .limit(50)
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
        .entrySet().stream()
//        .map(e -> { System.out.printf("N:%d, L:%d\n", e.getKey(), e.getValue()); return e; })
//        .peek(e -> System.out.printf("N:%d, L:%d\n", e.getKey(), e.getValue()))
        .min((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
        .map(e -> e.getKey())
        .orElseThrow(() -> new IllegalArgumentException("the data is supposed to be non empty"));
    System.out.println(goal);
  }
}
