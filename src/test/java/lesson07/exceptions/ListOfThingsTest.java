package lesson07.exceptions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListOfThingsTest {

  private Calculable c;

  @Before
  public void before() {
    this.c = new ListOfThings();
  }

  @Test
  public void calcSum1() {
    String origin = null;
    assertEquals(0, c.calcSum(origin));
  }

  @Test
  public void calcSum2() {
    String origin = "";
    assertEquals(0, c.calcSum(origin));
  }

  @Test
  public void calcSum3() {
    String origin = "dfvdfv dfvdf";
    assertEquals(0, c.calcSum(origin));
  }

  @Test
  public void calcSum4() {
    String origin = "dfdf";
    assertEquals(0, c.calcSum(origin));
  }

  @Test
  public void calcSum5() {
    String origin = "1 2 3";
    assertEquals(6, c.calcSum(origin));
  }

  @Test
  public void calcSum6() {
    String origin = "1 dfv 6";
    assertEquals(7, c.calcSum(origin));
  }

  @Test
  public void calcSum7() {
    String origin = "1 9 dsvef";
    assertEquals(10, c.calcSum(origin));
  }
}
