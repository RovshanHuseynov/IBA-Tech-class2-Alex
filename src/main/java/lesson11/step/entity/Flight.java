package lesson11.step.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Flight {
  // https://www.baeldung.com/java-datetimeformatter
  private final static DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
  private final int id;
  private final City src;
  private final City dst;
  private final LocalDate date;
  private final LocalTime time;

  public Flight(int id, City src, City dst, LocalDate date, LocalTime time) {
    this.id = id;
    this.src = src;
    this.dst = dst;
    this.date = date;
    this.time = time;
  }

  public int getId() {
    return id;
  }

  public City getSrc() {
    return src;
  }

  public City getDst() {
    return dst;
  }

  public LocalDate getDate() {
    return date;
  }

  public LocalTime getTime() {
    return time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Flight)) return false;

    Flight that = (Flight) o;

    if (this.id != that.id) return false;
    if (!Objects.equals(src, that.src)) return false;
    if (!Objects.equals(dst, that.dst)) return false;
    if (!Objects.equals(date, that.date)) return false;
    return Objects.equals(time, that.time);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (src != null ? src.hashCode() : 0);
    result = 31 * result + (dst != null ? dst.hashCode() : 0);
    result = 31 * result + (date != null ? date.hashCode() : 0);
    result = 31 * result + (time != null ? time.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return String.format("%s %-18s %-18s %12s %8s", id, src.getName(), dst.getName(), date, time.format(tf));
  }

}
