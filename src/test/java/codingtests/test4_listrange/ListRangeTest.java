package codingtests.test4_listrange;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ListRangeTest {
    @Test
    public void range11ShouldGiveListWithOnly1(){
        assertEquals(Arrays.asList(1),new ListRange().createList(1,1));
    }

}
