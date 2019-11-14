package lesson13.linkedlist;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList xl = new XLinkedList();
    xl.add(11);
    xl.add(22);
    xl.add(33);
    xl.add(44);

    boolean b11 = xl.contains(11); // true
    boolean b12 = xl.contains(12); // false

    System.out.println(xl);
  }
}
