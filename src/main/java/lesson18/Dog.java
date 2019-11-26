package lesson18;

public class Dog {
  private final int age;
  private final String name;

  public Dog(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String sound() {
    return "Bark!";
  }
}
