package lesson21.warmup;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NestedAppOptimized {

  private static IntStream convert(int[][] data) {
    return Arrays.stream(data).flatMapToInt(Arrays::stream);
  }

  public static void main(String[] args) {
    int[][] origin = {{1,6,3}, {}, {5,4}, {7,8,2,9}, {}};
    IntSummaryStatistics ss = convert(origin).summaryStatistics();
    convert(origin).sorted().forEach(System.out::println);

    ss.getSum();
    ss.getMin();
    ss.getMax();
    ss.getAverage();
    ss.getCount();
    // will not work !!!
    // stream is intended for single usage!
//    Stream<Integer> stream = Stream.of(1, 2, 3);
//    stream.forEach(System.out::println);
//    stream.forEach(System.out::println);

    Optional<Integer> min = Stream.of(1, 2, 3).min((o1, o2) -> o1 - o2);
  }
}
