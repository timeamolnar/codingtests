package codingtests.test5_listrotate;

import codingtests.test4_listrange.ListRange;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class ListRotateTest {
    private final ListRotate listToRotate = new ListRotate();
    //    rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    //    result: List[Symbol] = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')

    @Test
    public void rotateWith0ShouldReturnList(){
        assertEquals(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'),
                listToRotate.rotate(0, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateWithListSizeShouldReturnList(){
        assertEquals(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'),
                listToRotate.rotate(11, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateWith0ShouldReturnListInCaseOfIntegersAsWell(){
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                listToRotate.rotate(0, Arrays.asList(1,2,3,4,5,6,7)));
    }

    @Test
    public void rotateWith1ShouldReturnRotatedListWith1(){
        assertEquals(Arrays.asList('b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a'),
                listToRotate.rotate(1, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateWith3ShouldReturnRotatedListWith3(){
        assertEquals(Arrays.asList('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c'),
                listToRotate.rotate(3, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateWithMinus3ShouldReturnRotatedListBackwardsWith3(){
        assertEquals(Arrays.asList('i', 'j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
                listToRotate.rotate(-3, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateWithBiggerThanListSizeShouldRotateListWithTheOversizeNumber(){
        assertEquals(Arrays.asList('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c'),
                listToRotate.rotate(14, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }
}
