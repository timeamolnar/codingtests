package codingtests.test5_listrotate;

import java.util.ArrayList;
import java.util.List;

public class ListRotate {
    public<T> List<T> rotate(int nr, List<T> list) {
        if(nr > 0) {
            if(nr > list.size()) {
                nr -= list.size();
            }
            List<T> newList = new ArrayList<>(list.subList(nr,list.size()));
            newList.addAll(list.subList(0,nr));
            return newList;
        }

        if(nr < 0) {
            List<T> newList = new ArrayList<>(list.subList(list.size()+nr,list.size()));
            newList.addAll(list.subList(0,list.size()+nr));
            return newList;
        }

        return list;
    }
}
