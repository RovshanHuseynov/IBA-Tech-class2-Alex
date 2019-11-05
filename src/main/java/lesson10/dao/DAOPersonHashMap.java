package lesson10.dao;

public class DAOPersonHashMap implements DAO<Person> {

  @Override
  public void put(Person object) {
    throw new IllegalArgumentException("DAOPersonHashMap:put:not yet");
  }

  @Override
  public Person get(int id) {
    throw new IllegalArgumentException("DAOPersonHashMap:get:not yet");
  }

  @Override
  public void delete(int id) {
    throw new IllegalArgumentException("DAOPersonHashMap:delete:not yet");
  }
}
