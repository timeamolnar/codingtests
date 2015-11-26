package codingtests.test6_fizzbuzzwithlucky;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzWithLuckyTest {
    private final FizzBuzzWithLucky fb = new FizzBuzzWithLucky();

    //argTests
    @Test(expected = IllegalArgumentException.class)
    public void argumentCheckShouldBeInvalidForMoreThanOneArg(){
        fb.checkCommandLineArguments(new String[]{"1","2"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void argumentCheckShouldBeInvalidForNotANumberArg(){
        fb.checkCommandLineArguments(new String[]{"fifteen"});
    }

    @Test
    public void argumentCheckShouldBeValidForANumberArg(){
        fb.checkCommandLineArguments(new String[]{"14"});
        // no exception
    }

    //logicTests
    @Test
    public void numberContainingThreeShouldReturnLucky(){
        assertEquals("lucky", fb.convertNumber(13));
        assertEquals("lucky", fb.convertNumber(3));
        assertEquals("lucky", fb.convertNumber(1113));
        assertEquals("lucky", fb.convertNumber(333));
        assertEquals("lucky", fb.convertNumber(35));
    }

    @Test
    public void numberDividableByThreeButNotByFiveAndNotContainingThreeShouldReturnFizz(){
        assertEquals("fizz", fb.convertNumber(21));
        assertEquals("fizz", fb.convertNumber(66));
        assertEquals("fizz", fb.convertNumber(96));
    }

    @Test
    public void numberDividableByFiveButNotByThreeAndNotContainingThreeShouldReturnBuzz(){
        assertEquals("buzz", fb.convertNumber(5));
        assertEquals("buzz", fb.convertNumber(50));
        assertEquals("buzz", fb.convertNumber(22250));
    }

    @Test
    public void numberFifteenAndNotContainingThreeShouldReturnFizzBuzz() {
        assertEquals("fizzbuzz", fb.convertNumber(15));
        assertEquals("fizzbuzz", fb.convertNumber(1515));
    }

    @Test
    public void numberNotDividableByThreeorFiveAndNotContainingThreeShouldReturnItself() {
        assertEquals("41", fb.convertNumber(41));
        assertEquals("22", fb.convertNumber(22));
        assertEquals("11", fb.convertNumber(11));
        assertEquals("547", fb.convertNumber(547));
    }

}
