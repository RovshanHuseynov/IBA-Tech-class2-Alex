package lesson13.linkedlist;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList xl = new XLinkedList();
    xl.add(11);
    xl.add(22);
    xl.add(33);
    xl.add(44);

    // xl.contains(11); // true
    // xl.contains(12); // false

    System.out.println(xl);
  }
}
