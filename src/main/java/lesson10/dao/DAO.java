package lesson10.dao;

public interface DAO<T> {
  void put(T object);
  T get(int id);
  void delete(int id);
}
