package lesson07.optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptApp01 {

  public int behavior(String s) {
    if (s != null) {
      s = s + "asd";
    }
    System.out.println(s);
    return -42;
  }

  public static void main1(String[] args) {
    ArrayList<String> a = new ArrayList<>();
    a.add("one");
    a.add(null);
    a.add("two");
    a.add(null);
    a.add(null);
    a.add("three");
    a.add(null);
    a.add(null);
    a.add(null);
    a.forEach(s -> {if (s != null) System.out.printf("** %s **\n", s);});
  }

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = null;

    Optional<String> o1  = Optional.of(s1);
    Optional<String> o11 = Optional.ofNullable(s1);
    Optional<String> o2  = Optional.ofNullable(s2);
    Optional<String> o3  = Optional.empty();

    String extracted;
    if (o1.isPresent()) {
      extracted = o1.get();
    } else {
      extracted = "";
    }
    String s33 = o3.get();
    s33 = o3.orElse("DEFAULT");

    Optional<String> s34 = o1
        .map(s -> String.format(">> %s <<", s));

  }
}
