package lesson12;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] source = generate();
    int[] sorted = sort(source);
    System.out.printf("Source:%s\n", Arrays.toString(source));
    System.out.printf("Source:%s\n", Arrays.toString(sorted));
  }

  private static int[] sort(int[] source) {
    int[] sorted = source.clone();
    for (int i = 0; i < sorted.length; i++) {
      for (int j = i + 1; j < sorted.length; j++) {
        if (sorted[i] > sorted[j]) {
          int tmp = sorted[i];
          sorted[i] = sorted[j];
          sorted[j] = tmp;
        }
      }
    }

    return sorted;
  }

  private static int[] generate() {
    int[] data = new int[10];
    for (int i = 0; i < data.length; i++) {
      data[i] = (int) (Math.random()*20+10);
    }
    return data;
  }
}
