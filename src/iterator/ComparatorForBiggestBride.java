package iterator;

import java.util.Comparator;

public class ComparatorForBiggestBride implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        return o1.sizeBribe - o2.sizeBribe;
    }
}
