package lesson10.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOPersonHashMap implements DAO<Person> {

  // for HashMap implementation
  private Map<Integer, Person> storage = new HashMap<>();
  // for ArrayList implementation
//  private List<Person> storage2 = new ArrayList<>();

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

  @Override
  public List<Person> getAll() {
    throw new IllegalArgumentException("DAOPersonHashMap:getAll:not yet");
  }
}
