package lesson11.step.dao;

import lesson11.step.entity.Flight;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DAOFlightInMemory implements DAO<Flight> {
  private final Map<Integer, Flight> storage = new HashMap<>();

  public DAOFlightInMemory(Collection<Flight> data) {
    data.forEach(d -> storage.put(d.getId(), d));
  }

  public DAOFlightInMemory() {}

  @Override
  public Flight get(int id) {
    return storage.get(id);
  }

  @Override
  public List<Flight> getBy(Predicate<Flight> predicate) {
    return storage.values().stream().filter(predicate).collect(Collectors.toList());
  }

  @Override
  public List<Flight> getAll() {
    return new ArrayList<>(storage.values());
  }

  @Override
  public void put(Flight flight) {
    storage.put(flight.getId(), flight);
  }

  @Override
  public void delete(int id) {
    storage.remove(id);
  }

}
