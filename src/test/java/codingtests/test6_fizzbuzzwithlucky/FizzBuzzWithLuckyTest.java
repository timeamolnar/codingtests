package codingtests.test6_fizzbuzzwithlucky;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzWithLuckyTest {
    private final FizzBuzzWithLucky fb = new FizzBuzzWithLucky();
    @Test
    public void numberThreeShouldReturnLucky(){
        assertEquals("lucky", fb.convertNumber(3));
    }

}
