package lesson17.warmup;

import java.util.*;

public class Common {

  public static <T> List<T> list(T... strings) {
    return Arrays.asList(strings);
  }

  public static <K> Map<K, List<K>> map(Map.Entry<K, List<K>>... items) {
    HashMap<K, List<K>> m = new HashMap<>();
    for (Map.Entry<K, List<K>> item: items) {
      m.put(item.getKey(), item.getValue());
    }
    return m;
  }

  public static <K> Map.Entry<K, List<String>> of(K key, List<String> value) {
    return new AbstractMap.SimpleEntry<>(key, value);
  }

  public static <T> String combine(T... words) {
    StringJoiner sj = new StringJoiner(" ");
    for (T word: words) sj.add(word.toString());
    return sj.toString();
  }
}
