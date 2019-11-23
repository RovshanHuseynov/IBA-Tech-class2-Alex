package lesson17.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static lesson17.warmup.Common.*;

public class WarmUp1 {

  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs =    list("wrote", "chased", "slept on");
    List<String> objects =  list("the book","the ball","the bed");

    ArrayList<String> a = new ArrayList<>();
    subjects.forEach(subj ->
        verbs.forEach(verb ->
            objects.forEach(obj ->
                a.add(String.format("%s %s %s", subj, verb, obj)))));
    a.forEach(System.out::println);

    List<String> sentences =
        subjects.stream().flatMap(subj ->
            verbs.stream().flatMap(verb ->
                objects.stream().map(obj ->
                    String.format("%s %s %s", subj, verb, obj)
                ))).collect(Collectors.toList());

    sentences.forEach(s -> System.out.println(s));
    sentences.forEach(System.out::println);
  }
}
