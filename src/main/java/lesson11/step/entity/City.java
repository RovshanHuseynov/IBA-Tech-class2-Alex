package lesson11.step.entity;

import java.util.Objects;

public class City {
  private final int id;
  private final String name;

  public City(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("City{id:%d,name:'%s'}", id, name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof City)) return false;

    City city = (City) o;

    if (id != city.id) return false;
    return Objects.equals(name, city.name);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}
