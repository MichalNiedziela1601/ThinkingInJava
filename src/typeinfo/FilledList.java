package typeinfo;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "CountedInteger{" +
                "id=" + id +
                '}';
    }
}
public class FilledList<T> {

    private Class<T> type;
    public FilledList(Class<T> type) { this.type = type;}
    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        List<CountedInteger> countedIntegers = fl.create(9);
        System.out.println(countedIntegers);
    }
}
