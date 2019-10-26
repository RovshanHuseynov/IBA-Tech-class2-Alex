package lesson06.comparator;

import lesson03.equals.Pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PizzaApp {

  public static void main(String[] args) {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>() {{
      add(new Pizza(33));
      add(new Pizza(66));
      add(new Pizza(11));
      add(new Pizza(10));
    }};

    Comparator<Pizza> comparator = new Comparator<Pizza>() {
      @Override
      public int compare(Pizza o1, Pizza o2) {
        return o1.getSize() - o2.getSize();
      }
    };

    Comparator<Pizza> comparator2 = (o1, o2) -> o1.getSize() - o2.getSize();

    Collections.sort(pizzas, comparator);

    pizzas.forEach(s -> System.out.println(s));

    Collections.sort(pizzas, new Comparator<Pizza>() {
      @Override
      public int compare(Pizza o1, Pizza o2) {
        return o1.getSize() - o2.getSize();
      }
    });

    pizzas.forEach(s -> System.out.println(s));

    Collections.sort(pizzas, (o1, o2) -> o2.getSize() - o1.getSize());

    pizzas.forEach(s -> System.out.println(s));

  }
}
