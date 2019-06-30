import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Information<T>> {
    Map<String, List<T>> myMap = new HashMap() {
        @Override
        public Object get(Object key) {
            List defaultLst = new ArrayList();
            return getOrDefault(key, defaultLst);
        }
    };

    public Map<String, List<T>> getMailBox() {
        return myMap;
    }

    @Override
    public void accept(Information<T> tInformation) {
        if (myMap.containsKey(tInformation.getTo())) {
            myMap.get(tInformation.getTo()).add((T) tInformation.getContent());
        } else {
            List<T> myList = new ArrayList<>();
            myList.add((T) tInformation.getContent());
            myMap.put(tInformation.getTo(), myList);

        }
    }
}
