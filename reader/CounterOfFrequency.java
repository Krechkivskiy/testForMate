package reader;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CounterOfFrequency {
    public static void counterOfFrequency(String string) {
        Arrays.stream(string.toLowerCase().split("[^\\p{L}\\p{Digit}_]+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> new Comparator().compare(o1, o2))
                .limit(10)
                .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey()));
    }
}
