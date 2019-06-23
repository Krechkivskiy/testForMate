package reader;

import java.util.Map;

public class Comparator implements java.util.Comparator<Map.Entry<String, Long>> {
    @Override
    public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
        if (o2.getValue() > o1.getValue()) {
            return 1;
        }
        if (o2.getValue() < o1.getValue()) {
            return -1;
        } else {
            return o1.getKey().compareTo(o2.getKey());
        }
    }
}
