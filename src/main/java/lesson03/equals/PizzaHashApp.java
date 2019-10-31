package lesson03.equals;

import java.util.HashSet;
import java.util.Set;

public class PizzaHashApp {
  public static void main(String[] args) {

    Set<Pizza> pizzas = new HashSet<Pizza>();
    pizzas.add(new Pizza(33));
    pizzas.add(new Pizza(33));
    System.out.println(pizzas.size());

  }
}
