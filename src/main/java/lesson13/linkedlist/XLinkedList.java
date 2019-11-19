package lesson13.linkedlist;

import java.util.StringJoiner;

public class XLinkedList {

  private int lengthr(XItem current) {
    if (current == null) return 0;
    return 1 + lengthr(current.next);
  }

  public int lengthr() {
    return lengthr(head);
  }

  private int lengthr2(XItem current, int len) {
    if (current == null) return len;
    return lengthr2(current.next, 1 + len);
  }

  public int lengthr2() {
    return lengthr2(head, 0);
  }

  public int length() {
    int l = 0;
    for (XItem current = head; current != null; current = current.next) {
      l+=1;
    }
    return l;
  }

  public void revert_while() {
    XItem current = head;
    XItem prev = null;
    while (current !=null) {
      XItem savedNext = current.next;
      current.next = prev;
      prev = current;
      current = savedNext;
    }
    head = prev;
  }

  private void revert(XItem curr) {
    throw new IllegalArgumentException("Should be implemented at Home!");
  }

  public void revert_recursive() {
    // revert(head);
    throw new IllegalArgumentException("Should be implemented at Home!");
  }

  public static class XItem {
    public int value;
    public XItem next;

    public XItem(int value) {
      this.value = value;
    }
  }

  private XItem head;

  public XItem getHead() {
    return head;
  }

  public boolean contains(int value) {
    XItem current = head;
    while (current != null) {
      if (current.value == value) return true;
      current = current.next;
    }
    return false;
  }

  public boolean contains_for(int value) {
    for (XItem current = head; current != null; current = current.next) {
      if (current.value == value) return true;
    }
    return false;
  }

  public void add(int value) {
    XItem item = new XItem(value);
    if (head == null) {
      head = item;
    } else {
      XItem current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = item;
    }
  }

  public void remove(int value) {
    XItem curr = head;
    XItem prev = null;
    while (curr != null) {
      if (curr.value == value) {
        if (prev == null) {
          head = head.next;
          break;
        }
        prev.next = curr.next;
        break;
      }
      prev = curr;
      curr = curr.next;
    }
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(",","[","]");
    for (XItem current = head; current != null; current = current.next) {
      sj.add(String.valueOf(current.value));
    }
    return sj.toString();
  }
}
