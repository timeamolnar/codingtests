package codingtests.test4_listrange;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListRange {

    public List<Integer> createList(int start, int end) {
        Preconditions.checkArgument(start<=end,"Start should be smaller or equal to end");

        List myList = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            myList.add(i);
        }
        return myList;
    }
}
