package lesson23.annotations;

@Ready(value = 10, owner = "John")
public class Banana {
  @Override
  public String toString() {
    return "I'm Banana";
  }
}
