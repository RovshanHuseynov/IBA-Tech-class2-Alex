package lesson21.warmup;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NestedApp {
  public static void main(String[] args) {
    int[][] origin = {{1,6,3}, {}, {5,4}, {7,8,2,9}, {}};
    Stream<int[]> step1 = Arrays.stream(origin);
    Stream<Integer> step2 = step1.flatMap(new Function<int[], Stream<Integer>>() {
      @Override
      public Stream<Integer> apply(int[] ints) {
        IntStream stream1 = Arrays.stream(ints);
        Stream<Integer> stream2 = stream1.boxed(); // int -> Integer
        return stream2;
      }
    });
    Stream<Integer> step3 = step2.sorted();
    IntStream intStream = step2.mapToInt(i -> i); // unbox: Integer -> int
    IntSummaryStatistics ss = intStream.summaryStatistics();
    ss.getSum();
    ss.getMin();
    ss.getMax();
    ss.getAverage();
    ss.getCount();

  }
}
