package lesson11.step;

import lesson11.step.entity.TimeTable;

public class Database {

  public boolean isExisted() {
    return false;
  }

  public void createInitialData() {
    Cities c = new Cities();
    c.create();
    TimeTable tt = new TimeTable();
    tt.create();
    // create cities
    // create timetable
    // ...

  }
}
