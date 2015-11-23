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
    public void rotate0ListShouldReturnList(){
        assertEquals(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'),
                listToRotate.rotate(0, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotate1ListShouldReturnRotatedListWith1(){
        assertEquals(Arrays.asList('b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a'),
                listToRotate.rotate(1, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotate3ShouldReturnRotatedListWith3(){
        assertEquals(Arrays.asList('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c'),
                listToRotate.rotate(3, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test
    public void rotateMinus3ShouldReturnRotatedListBackwardsWith3(){
        assertEquals(Arrays.asList('i', 'j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
                listToRotate.rotate(-3, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sizeOfListSmallerThanRotationNumberShouldBeInvalid(){
        listToRotate.rotate(11, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'));
    }

}
