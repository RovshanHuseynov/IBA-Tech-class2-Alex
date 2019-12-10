package lesson25.warmup;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SixGroups {

  enum T1 { LT10, GT10, RS }
  enum T2 { ODD, EVEN }

  public static void main(String[] args) {
    Function<Integer, T1> classifier1 = (Integer el) -> {
      if (el < -10) return T1.LT10;
      if (el > 10) return T1.GT10;
      return T1.RS;
    };

    Function<Integer, T2> classifier2 = new Function<Integer, T2>() {
      @Override
      public T2 apply(Integer el) {
        return Math.abs(el) % 2 > 0 ? T2.ODD : T2.EVEN;
      }
    };

    T1 r1 = classifier1.apply(-15);
    T2 r2 = classifier2.apply(3);

    Map<T1, List<Integer>> collected0 =
        Stream.generate(() -> (int) (Math.random() * 51 - 25)) // Stream<Integer>
            .limit(50) // length 50
            .collect(Collectors.groupingBy(classifier1));

    Map<T1, Map<T2, List<Integer>>> collected1 =
        Stream.generate(() -> (int) (Math.random() * 51 - 25)) // Stream<Integer>
        .limit(50) // length 50
        .collect(Collectors.groupingBy(classifier1,
            Collectors.groupingBy(classifier2
            )));

    Map<T1, Map<T2, Long>> collected2 = Stream.generate(() -> (int) (Math.random() * 51 - 25)) // Stream<Integer>
        .limit(50) // length 50
        .collect(Collectors.groupingBy(classifier1,
            Collectors.groupingBy(classifier2,
                Collectors.counting()
            )));

    collected0.forEach((k,v)-> System.out.printf("%s, %s\n",k,v));
    collected1.forEach((k,v)-> System.out.printf("%s, %s\n",k,v));
    collected2.forEach((k,v)-> System.out.printf("%s, %s\n",k,v));

  }
}
