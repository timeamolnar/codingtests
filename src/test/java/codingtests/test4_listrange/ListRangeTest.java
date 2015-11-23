package codingtests.test4_listrange;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ListRangeTest {

    private final ListRange listRange = new ListRange();

    @Test
    public void range11ShouldGiveListWithOnly1(){
        assertEquals(Arrays.asList(1), listRange.createList(1,1));
    }

    @Test
    public void range12ShouldGiveListWith12(){
        assertEquals(Arrays.asList(1,2), listRange.createList(1,2));
    }

    @Test
    public void range13ShouldGiveListWith123(){
        assertEquals(Arrays.asList(1,2,3), listRange.createList(1,3));
    }

    @Test
    public void rangeMinus3Minus1ShouldGiveListWithMinus3Minus2Minus1(){
        assertEquals(Arrays.asList(-3,-2,-1), listRange.createList(-3,-1));
    }

    @Test
    public void range49ShouldGiveListWith456789(){
        assertEquals(Arrays.asList(4,5,6,7,8,9), listRange.createList(4,9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void startBiggerThanEndShouldBeInvalid(){
        listRange.createList(1,0);
    }

}
