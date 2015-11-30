package codingtests.test5_listrotate;

import java.util.ArrayList;
import java.util.List;

public class ListRotate {
    public<T> List<T> rotate(int rotationNr, List<T> list) {
        rotationNr %= list.size();

        if(rotationNr > 0) {
            return getRotatedList(rotationNr, list);
        }

        if(rotationNr < 0) {
            return getRotatedList(list.size()+rotationNr, list);
        }

        return list;
    }

    private <T> List<T> getRotatedList(int rotation, List<T> list) {
        List<T> resultList = new ArrayList<>(list.subList(rotation, list.size()));
        resultList.addAll(list.subList(0, rotation));
        return resultList;
    }

}
