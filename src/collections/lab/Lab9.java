package collections.lab;

import innerclass.Sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lab9 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Object[] items = sequence.getItems();
        List<Object> sequences = new ArrayList<Object>(Arrays.asList(items));
        Iterator<Object> iterator = sequences.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.print(o + " ");
        }
    }
}
