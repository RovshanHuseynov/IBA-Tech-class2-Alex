package lesson11.step.generate;

import lesson11.step.entity.City;

import java.util.ArrayList;
import java.util.List;

public class NewCities {
  public static List<City> create() {
    final int[] idx = { 0 };
    CityNames cityNames = new CityNames();
    ArrayList<City> cities = new ArrayList<>();
    cityNames.forEach(name -> cities.add(new City(++idx[0], name)));
    return cities;
  }
}
