package lesson08.fraction;

import java.util.ArrayList;
import java.util.List;

public class MockConsole implements Console {

  private final List<Object> data = new ArrayList<>();

  @Override
  public void putLn(Object origin) {
    data.add(origin);
  }

  @Override
  public String getLn() {
    return "3/4+1/4";
  }

  public List<Object> getData() {
    return data;
  }
}
