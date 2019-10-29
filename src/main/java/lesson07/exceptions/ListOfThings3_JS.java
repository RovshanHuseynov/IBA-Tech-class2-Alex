package lesson07.exceptions;

public class ListOfThings3_JS {

  public int[] calcSum(String origin) {
    if (origin == null) return new int[]{0, 0};
    String[] split = origin.split(" ");
    int total = 0;
    int count = 0;
    for (int i=0; i<split.length; i++) {
      try {
        total += Integer.parseInt(split[i]);
      } catch (NumberFormatException ignore) {}
    }
    return new int[]{total, count};
  }

}
