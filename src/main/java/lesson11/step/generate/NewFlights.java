package lesson11.step.generate;

import lesson11.step.dao.DAO;
import lesson11.step.dao.DAOFlightInMemory;
import lesson11.step.entity.City;
import lesson11.step.entity.Flight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewFlights {
  private final static Random rnd = new Random();
  private final List<City> cities;

  public NewFlights() {
    this.cities = NewCities.create();
  }

  private int rnd_flight_id() {
    return rnd.nextInt(900) + 100;
  }

  private City rnd_city() {
    return cities.get(rnd.nextInt(cities.size()));
  }

  private LocalDate rnd_date() {
    return LocalDate.now().plusDays(rnd.nextInt(10));
  }

  private LocalTime rnd_time() {
    return LocalTime.of(rnd.nextInt(10)+7, rnd.nextInt(6)*10);
  }

  public List<Flight> create(int number) {
    List<Flight> flights = new ArrayList<>();
    while (flights.size() < number) {
      flights.add(new Flight(rnd_flight_id(), rnd_city(), rnd_city(), rnd_date(), rnd_time()));
    }
    return flights;
  }

  public static List<Flight> create() {
    return new NewFlights().create(20);
  }

  /**
   * design example
   */
  public static void main(String[] args) {
    DAO<Flight> dao = new DAOFlightInMemory(NewFlights.create());
    dao.getAll().forEach(System.out::println);
    System.out.println();
    dao.getBy(f -> f.getSrc().getName().equals("Jacksonville")).forEach(System.out::println);
    System.out.println();
    LocalDate todayPlus1 = LocalDate.now().plusDays(1);
    dao.getBy(f -> f.getDate().isBefore(todayPlus1)).forEach(System.out::println);
  }

}
