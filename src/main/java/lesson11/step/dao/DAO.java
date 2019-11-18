package lesson11.step.dao;

import java.util.List;
import java.util.function.Predicate;

public interface DAO<T> {
  T get(int id);
  List<T> getBy(Predicate<T> predicate);
  List<T> getAll();
  void put(T t);
  void delete(int id);
}
