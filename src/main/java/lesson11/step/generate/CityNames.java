package lesson11.step.generate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CityNames implements Iterable<String>{
  private final List<String> cities = Arrays.asList("New York",
      "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia",
      "San Antonio", "San Diego", "Dallas", "San Jose", "Austin",
      "Jacksonville", "Fort Worth", "Columbus", "San Francisco",
      "Charlotte", "Indianapolis", "Seattle",
      "Denver", "Washington", "Boston");

  @Override
  public Iterator<String> iterator() {
    return cities.iterator();
  }
}
