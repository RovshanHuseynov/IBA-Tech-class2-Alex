package lesson08.hashcode;

import java.util.HashSet;
import java.util.Set;

public class PizzaHashApp {
  public static void main(String[] args) {
    Set<TastyPizza> set = new HashSet<>();
    TastyPizza p1 = new TastyPizza(33, 100, "pepper", new String[]{"cheese", "bread", "oil"});
//    TastyPizza p2 = new TastyPizza(33, 100, "pepper", new String[]{"cheese", "bread", "oil"});
    TastyPizza p2 = new TastyPizza(33, 101, "oil", new String[]{"cheese", "bread", "tomato"});
    System.out.println(p1.equals(p2));
    set.add(p1);
    set.add(p2);
    System.out.println(set.size());
  }
}
