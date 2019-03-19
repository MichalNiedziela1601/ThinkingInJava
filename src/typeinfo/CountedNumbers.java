package typeinfo;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString() { return Long.toString(id);}
}
public class CountedNumbers<T> {

    private Class<T> type;
    public CountedNumbers(Class<T> type) { this.type = type;}

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return result;
    }

    public static void main(String[] args) {
        CountedNumbers<CountedInteger> countedIntegerCountedNumbers = new CountedNumbers<CountedInteger>(CountedInteger.class);
        System.out.println(countedIntegerCountedNumbers.create(15));
    }


}
