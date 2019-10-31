package lesson08.hashcode;

import java.util.Arrays;
import java.util.List;

public class TastyPizza
//    implements Comparable<Pizza>
{
  private int size;
  private int price;
  private String smell;
  private String[] ingridients;
//  private List<String> ingridients2;

  public TastyPizza(int size, int price, String smell, String[] ingridients) {
    this.size = size;
    this.price = price;
    this.smell = smell;
    this.ingridients = ingridients;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getSmell() {
    return smell;
  }

  public void setSmell(String smell) {
    this.smell = smell;
  }

  public String[] getIngridients() {
    return ingridients;
  }

  public void setIngridients(String[] ingridients) {
    this.ingridients = ingridients;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) return false;
    if (this == that) return true;
    if (!(that instanceof TastyPizza)) return false;

    TastyPizza thatPizza = (TastyPizza) that;
    if (this.size == thatPizza.size
        && this.price == thatPizza.price
        && this.smell.equals(thatPizza.smell)
//        && this.ingridients2.equals(thatPizza.ingridients2)
        && Arrays.equals(this.ingridients, thatPizza.ingridients)
    ) {
      return true;
    } else {
      return false;
    }
  }

//  @Override
//  public int hashCode() {
//    return 1;
//    int r = size;
//    r = r * 31 + price;
//    r = r * 31 + smell.hashCode();
//    r = r * 31 + Arrays.hashCode(ingridients);
//    return r;
//  }

  @Override
  public String toString() {
    return String.format("Pizza: %d", this.size);
  }

//  @Override
//  public int compareTo(Pizza that) {
//    return this.size - that.size;
//  }
}
