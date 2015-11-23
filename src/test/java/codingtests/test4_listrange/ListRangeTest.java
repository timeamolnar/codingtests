package codingtests.test4_listrange;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ListRangeTest {
    @Test
    public void range11ShouldGiveListWithOnly1(){
        assertEquals(Arrays.asList(1), new ListRange().createList(1,1));
    }

    @Test
    public void range12ShouldGiveListWith12(){
        assertEquals(Arrays.asList(1,2), new ListRange().createList(1,2));
    }

    @Test
    public void range13ShouldGiveListWith123(){
        assertEquals(Arrays.asList(1,2,3), new ListRange().createList(1,3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void startBiggerThanEndShouldBeInvalid(){
        new ListRange().createList(1,0);
    }

}
