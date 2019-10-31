package lesson08.datetime;

public class ProblemApp {

  interface Date {
    int day();   // 1..31
    int month(); // 1..12
  }

  interface Time {
    int hour();       // 0..23 or 0..12 AM/PM
    int minute();     // 0..59
    int second();     // 0..59
    int millisecond();// 0..999
    int nanosecond(); // 0..999
    String string();
  }

  interface Timezone {
    // GMT, CET, CEST, GMT+3, GMT+4, GMT-8, ...
    // India and Sri-Lanka: IST = GMT +5:30 ...
    // I have no idea...
    // Kathmandu = GMT +5:45
    // I'm lost completely
  }

  /**
   * questions:
   * 1. how to represent
   * 2. how to work with
   * 3. how to store without any data loss
   * 4. how to parse ...
   * 5. how to know where you are ...
   * ...
   */
  public static void main(String[] args) {

  }
}
