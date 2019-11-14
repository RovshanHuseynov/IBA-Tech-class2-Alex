package lesson13.linkedlist;

import java.util.StringJoiner;

public class XLinkedList {

  class XItem {
    int value;
    XItem next;

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
