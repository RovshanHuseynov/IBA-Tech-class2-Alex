package lesson15.merge;

import lesson13.linkedlist.XLinkedList;

import java.util.StringJoiner;

public class Merge {

  public String toString(XLinkedList.XItem head) {
    StringJoiner sj = new StringJoiner(",","[","]");
    for (XLinkedList.XItem current = head; current != null; current = current.next) {
      sj.add(String.valueOf(current.value));
    }
    return sj.toString();
  }

  public XLinkedList.XItem merge(XLinkedList.XItem head1, XLinkedList.XItem head2) {
    XLinkedList.XItem head = null;
    XLinkedList.XItem current1 = head1;
    XLinkedList.XItem current2 = head2;
    XLinkedList.XItem current = head;


    return head;
  }
}
