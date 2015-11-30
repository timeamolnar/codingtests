package codingtests.test5_listrotate;

import java.util.ArrayList;
import java.util.List;

public class ListRotate {
    public<T> List<T> rotate(int rotationNr, List<T> list) {
        int listSize = list.size();

        if(Math.abs(rotationNr) > listSize) {
            rotationNr %= listSize;
        }

        if(rotationNr > 0) {
            List<T> newList = new ArrayList<>(list.subList(rotationNr, listSize));
            newList.addAll(list.subList(0, rotationNr));
            return newList;
        }

        if(rotationNr < 0) {
            List<T> newList = new ArrayList<>(list.subList(listSize + rotationNr, listSize));
            newList.addAll(list.subList(0, listSize + rotationNr));
            return newList;
        }

        return list;
    }
}
