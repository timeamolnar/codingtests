package codingtests.test5_listrotate;

import java.util.ArrayList;
import java.util.List;

public class ListRotate {
    public<T> List<T> rotate(int rotationNr, List<T> list) {
        rotationNr %= list.size();

        if(rotationNr > 0) {
            return getRotatedList(rotationNr, list, list.size());
        }

        if(rotationNr < 0) {
            return getRotatedList(list.size()+rotationNr, list, list.size());
        }

        return list;
    }

    private <T> List<T> getRotatedList(int rotation, List<T> list, int size) {
        List<T> resultList = new ArrayList<>(list.subList(rotation, size));
        resultList.addAll(list.subList(0, rotation));
        return resultList;
    }

}
