package lesson03.equals;

public class Pizza
//    implements Comparable<Pizza>
{
  private int size;

  public Pizza(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) return false;
    if (this == that) return true;
    if (!(that instanceof Pizza)) return false;

    Pizza thatPizza = (Pizza) that;
    if (this.size == thatPizza.size) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return String.format("Pizza: %d", this.size);
  }

//  @Override
//  public int compareTo(Pizza that) {
//    return this.size - that.size;
//  }
}
