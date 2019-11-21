package lesson16;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShiftNeg {
  int[] shift(int[] origin) {
    int[] shifted = origin.clone();

    List<Integer> negative_indexes =
        IntStream.range(0, origin.length) // Stream<int>
            .filter(idx -> origin[idx] < 0)
            .boxed()                      // Stream<Integer>
            .collect(Collectors.toList());

    LinkedList<Integer> negative_shifted_indexes =
        new LinkedList<>(negative_indexes);

    negative_shifted_indexes.addFirst(
        negative_shifted_indexes.pollLast());

    IntStream.range(0, negative_indexes.size())
        .forEach(idx -> shifted[negative_indexes.get(idx)] =
            origin[negative_shifted_indexes.get(idx)]);

    return shifted;
  }
}
