package lesson07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L7T1Warmup {

  public static boolean isOdd(int val) {
    return val % 2 !=0;
  }

  public static boolean isEven(int val) {
    return ! isOdd(val);
  }

  public static void sort(List<Integer> reference) {
    reference.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        if (isEven(o1) && isOdd(o2)) return -1;
        else if (isEven(o1) && isEven(o2)) return o2 - o1;
        else if (isOdd(o1) && isOdd(o2)) return o1 - o2;
        else return 1;
      }
    });
  }

  public static void main(String[] args) {
    List<Integer> origin = Stream.generate(() -> (int) (Math.random() * 100))
        .limit(30).collect(Collectors.toList());
    ArrayList<Integer> sorted = new ArrayList<>(origin);
    sort(sorted);
    System.out.println(origin);
    System.out.println(sorted);
  }
}
