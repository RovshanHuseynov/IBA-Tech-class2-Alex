package lesson09;

import java.util.List;
import java.util.stream.IntStream;

public class Warmup09v2 {
  public static void main(String[] args) {
    List<Integer> data =
        Source.random_int_from_range(0, 100, 30);

    PairM pair = IntStream.range(0, data.size() - 1)
        .mapToObj(idx -> new PairM(idx, data.get(idx) + data.get(idx + 1)))
        .min((p1, p2) -> p1.getSum() - p2.getSum())
        .orElse(PairM.empty());

    System.out.printf("Array: %s\n", data);
    System.out.printf("Left index: %d\n", pair.getIdx());
    System.out.printf("Right index: %d\n", pair.getIdx()+1);
    System.out.printf("The sum: %d\n", pair.getSum());
  }
}
