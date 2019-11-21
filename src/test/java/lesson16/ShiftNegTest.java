package lesson16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftNegTest {

  private ShiftNeg c;

  @Before
  public void setUp() {
    this.c = new ShiftNeg();
  }

  @Test
  public void shift() {
    int[] origin = {7,-6,1,2,-3,3,4,5,-1,6,7,-2,8,9,-3,8};
    int[] expected = {7,-3,1,2,-6,3,4,5,-3,6,7,-1,8,9,-2,8};
    assertArrayEquals(expected, c.shift(origin));
  }
}
