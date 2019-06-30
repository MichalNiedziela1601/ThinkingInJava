package concurrency;

public class EvenGenerator extends IntGenerator {
    private int currenctEvenValue = 0;
    public int next() {
        ++currenctEvenValue;
        ++currenctEvenValue;
        return currenctEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
