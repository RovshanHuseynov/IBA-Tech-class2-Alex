package lesson16.tree;

public class XTreeApp {
  public static void main(String[] args) {
    XTree x = new XTree();
    x.add(20);
    x.add(10);
    x.add(30);
    x.add(35);
    x.add(31);
    System.out.println(x.contains(20));
    System.out.println(x.contains(10));
    System.out.println(x.contains(11));
  }
}
