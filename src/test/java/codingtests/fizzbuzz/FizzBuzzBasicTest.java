package codingtests.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzBasicTest {

  private final FizzBuzzBasic fb = new FizzBuzzBasic();

  @Test
  public void numberThreeShouldReturnFizz(){
    assertEquals("fizz", fb.convertNumberToFizzBuzz(3));
  }

  @Test
  public void numberFiveShouldReturnBuzz(){
    assertEquals("buzz", fb.convertNumberToFizzBuzz(5));
  }

  @Test
  public void numberFifteenShouldReturnFizzBuzz() {
    assertEquals("fizzbuzz", fb.convertNumberToFizzBuzz(15));
  }

  @Test
  public void notDividableByThreeOrFiveShouldReturnNumber() {
    assertEquals("2", fb.convertNumberToFizzBuzz(2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void zeroShouldReturnIllegalArgumentException() {
    fb.convertNumberToFizzBuzz(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void negativeNumberShouldReturnIllegalArgumentException() {
    fb.convertNumberToFizzBuzz(-1);
  }

  @Test
  public void dividableByThreeShouldReturnFizz(){
    assertEquals("fizz", fb.convertNumberToFizzBuzz(6));
    assertEquals("fizz", fb.convertNumberToFizzBuzz(9));
  }

  @Test
  public void dividableByFiveShouldReturnBuzz(){
    assertEquals("buzz", fb.convertNumberToFizzBuzz(10));
    assertEquals("buzz", fb.convertNumberToFizzBuzz(20));
  }

  @Test
  public void dividableByThreeAndFiveShouldReturnFizzBuzz() {
    assertEquals("fizzbuzz", fb.convertNumberToFizzBuzz(30));
    assertEquals("fizzbuzz", fb.convertNumberToFizzBuzz(45));
  }

  @Test
  public void forNumbersFromTwoToSixShouldBeConvertedToFizzBuzzList() {
    assertEquals(Arrays.asList(new String[]{"2", "fizz", "4", "buzz", "fizz"}), fb.getFizzBuzzValuesForNumbers(2,6));
  }

  @Test
  public void forNumbersFromOneToFifteenShouldBeConvertedToFizzBuzzList() {
    assertEquals(Arrays.asList(new String[]{"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"}), fb.getFizzBuzzValuesForNumbers(1,15));
  }
}
