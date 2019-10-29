package lesson07.exceptions;

import java.util.ArrayList;

public class Holder {
  private int sum;
  private int count;
  private ArrayList<String> wrong;

  public Holder() {
    this(0,0, new ArrayList<>());
  }

  public Holder(int sum, int count, ArrayList<String> wrong) {
    this.sum = sum;
    this.count = count;
    this.wrong = wrong;
  }

  public int getSum() {
    return sum;
  }

  public int getCount() {
    return count;
  }

  public ArrayList<String> getWrong() {
    return wrong;
  }
}
