package lesson06.charpos;

import lesson04.warmup.Lesson4Task1;

import java.util.*;
import java.util.function.BiConsumer;

public class CharacterPositions {

  public Map<Character, List<Integer>> process(String origin_) {
    String origin = origin_.toLowerCase();
    // unique
    Set<Character> unique = new HashSet<Character>();
    for (int index = 0; index < origin.length(); index++) {
      char c = origin.charAt(index);
      unique.add(c);
    }
    // map initialization with <char, empty list>
    Map<Character, List<Integer>> positions = new HashMap<>();
    for (Character c: unique) {
      positions.put(c, new ArrayList<>());
    }

    for (int index = 0; index < origin.length(); index++) {
      char c = origin.charAt(index);
      positions.get(c).add(index + 1);
    }
    return positions;
  }

  public void printOutput(Map<Character, List<Integer>> data) {
    Set<Map.Entry<Character, List<Integer>>> entries = data.entrySet();
    for (Map.Entry<Character, List<Integer>> item: entries) {
      Character key = item.getKey();
      List<Integer> positions = item.getValue();
      int size = positions.size();

      System.out.printf("letter: %c : %d : %s\n",
          key, size, positions);
    }
  }

  public void printOutput2(Map<Character, List<Integer>> data) {
    data.forEach(new BiConsumer<Character, List<Integer>>() {
      @Override
      public void accept(Character ch, List<Integer> list) {
        System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);
      }
    });
  }

  public void printOutput4(Map<Character, List<Integer>> data) {
    BiConsumer<Character, List<Integer>> biConsumer = new BiConsumer<Character, List<Integer>>() {
      @Override
      public void accept(Character ch, List<Integer> list) {
        System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);
      }
    };

    data.forEach(biConsumer);
  }

  public void printOutput5(Map<Character, List<Integer>> data) {
    BiConsumer<Character, List<Integer>> biConsumer =
        (ch, list) -> System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);

    data.forEach(biConsumer);
  }

  public void printOutput3(Map<Character, List<Integer>> data) {
    data.forEach((ch, list) -> System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list));
  }

  public static void main(String[] args) {
    // 1. data obtaining
    Lesson4Task1 l4t1 = new Lesson4Task1();
    final String origin = l4t1.generate_random_string(80);
    // 2. data process
    CharacterPositions app = new CharacterPositions();
    Map<Character, List<Integer>> result = app.process(origin);
    // 3. output the result
    System.out.println(origin);
//    app.printOutput(result);
//    app.printOutput2(result);
    app.printOutput3(result);
  }
}
