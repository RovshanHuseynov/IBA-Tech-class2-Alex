package lesson21.warmup;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NestedMorethanTwo {
  public static void main(String[] args) {
    int[][][][][] nested = null;
    Stream<int[][][][]> stream1 = Arrays.stream(nested);
    Stream<int[][][]> stream2 = stream1.flatMap((Function<int[][][][], Stream<int[][][]>>) ints -> Arrays.stream(ints));
    Stream<int[][]> stream3 = stream2.flatMap((Function<int[][][], Stream<int[][]>>) ints -> Arrays.stream(ints));
    Stream<int[]> stream4 = stream3.flatMap((Function<int[][], Stream<int[]>>) ints -> Arrays.stream(ints));
    IntStream stream5 = stream4.flatMapToInt((Function<int[], IntStream>) ints -> Arrays.stream(ints));
  }
}
