package lesson11;

public class ShoesPairs {
  int calc(String origin) {
    int intervals = 0;
    int pairs = 0;
    for (int i = 0; i < origin.length(); i++) {
      switch (origin.charAt(i)) {
        case 'L': pairs++; break;
        case 'R': pairs--; break;
      }
      if (pairs == 0) intervals++;
    }
    return intervals;
  }
}
