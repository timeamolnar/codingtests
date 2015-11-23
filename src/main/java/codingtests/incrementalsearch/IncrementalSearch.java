package codingtests.incrementalsearch;

import java.util.List;



public interface IncrementalSearch {
    List<String> search(String searchString);
    // clear search string
    void clear();
}
