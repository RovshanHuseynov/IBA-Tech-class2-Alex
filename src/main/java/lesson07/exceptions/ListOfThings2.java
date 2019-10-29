package lesson07.exceptions;

public class ListOfThings2 {

  public int convert(String origin) {
    try {
      return Integer.parseInt(origin);
    } catch (Exception e) {
      return 0;
    }
  }

  public int calcSum(String origin) {
    if (origin == null) return 0;
    String[] split = origin.split(" ");
    int total = 0;
    for (int i=0; i<split.length; i++) {
      total += convert(split[i]);
    }
    return total;
  }
}
