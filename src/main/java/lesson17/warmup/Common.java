package lesson17.warmup;

import java.util.*;

public class Common {

  public static <T> List<T> list(T... strings) {
    return Arrays.asList(strings);
  }

  public static <K> Map<K, List<K>> map(Entry<K, List<K>>... items) {
    HashMap<K, List<K>> m = new HashMap<>();
    for (Entry<K, List<K>> item: items) {
      m.put(item.getKey(), item.getVal());
    }
    return m;
  }

  public static <T> Entry<T, List<T>> of(T key, List<T> value) {
    return new Entry<>(key, value);
  }

  public static <T> String combine(T... words) {
    StringJoiner sj = new StringJoiner(" ");
    for (T word: words) sj.add(word.toString());
    return sj.toString();
  }
}
