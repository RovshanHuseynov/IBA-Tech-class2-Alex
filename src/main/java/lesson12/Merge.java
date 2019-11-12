package lesson12;

import java.util.Arrays;

public class Merge {
  public static void main(String[] args) {
    int[] a = {1,3,5,7,13}; // sorted !
    int[] b = {2,4,6,20,40,100}; // sorted !
    // idea: O(a.length + b.length) = 11
    int[] c = merge(a,b);
    System.out.printf("a:%s\n", Arrays.toString(a));
    System.out.printf("b:%s\n", Arrays.toString(b));
    System.out.printf("c:%s\n", Arrays.toString(c));
  }

  private static int[] merge(int[] a, int[] b) {
    int[] data = new int[a.length+b.length];
    int i=0, j=0, k=0;
    while (i<a.length && j<b.length) {
      if (a[i] < b[j]) {
        data[k++]=a[i++];
      } else {
        data[k++]=b[j++];
      }
    }
    while(i<a.length) data[k++] = a[i++];
    while(j<b.length) data[k++] = b[j++];
    return data;
  }
}
