package generics;

import java.util.Iterator;

public class IterableFibonaci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonaci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonaci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new IterableFibonaci(18)) {
            System.out.println(i + " ");
        }
    }
}
