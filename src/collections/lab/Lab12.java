package collections.lab;

import java.util.*;

public class Lab12 {
    public static ArrayList<Integer> generator(int size) {
        Random rand = new Random(47);
        Integer[] array = new Integer[size];
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size*10);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,array);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = generator(4);
        Random rand = new Random(46);
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            list2.add(rand.nextInt(20));
        }
        ListIterator<Integer> it = list1.listIterator();
        System.out.println("1: list1 = " + list1);
        System.out.println("2: list2 = " + list2);

        while(it.hasNext()) {
            it.next();
        }
        while (it.hasPrevious()) {
            list2.add(it.previous());
        }
        System.out.println("3: list2 = " + list2);
    }
}
