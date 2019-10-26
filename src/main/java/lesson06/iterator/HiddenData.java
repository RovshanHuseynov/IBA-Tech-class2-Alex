package lesson06.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HiddenData implements Iterable<String> {
  private final List<String> months = Arrays.asList(
      "Jan","Feb","Mar","Apr","May");

  @Override
  public Iterator<String> iterator() {
    return null;
  }
}
