package lesson21.warmup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NestedAppOptimized {
  public static void main(String[] args) {
    int[][] origin = {{1,6,3}, {}, {5,4}, {7,8,2,9}, {}};
    IntStream ints = Arrays.stream(origin).flatMapToInt(Arrays::stream);
    IntSummaryStatistics ss = ints.summaryStatistics();
    ints.sorted().forEach(System.out::println);

    Optional<Integer> min = Stream.of(1, 2, 3).min((o1, o2) -> o1 - o2);

    ss.getSum();
    ss.getMin();
    ss.getMax();
    ss.getAverage();
    ss.getCount();

  }
}
