package collections.lab;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lab14 {
    static void addInMiddle(LinkedList<Integer> list, Integer[] xi) {
        for(Integer i : xi) {
            ListIterator<Integer> it = list.listIterator(list.size()/2);
            it.add(i);
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Integer[] integers = {0,1,2,3,4,5,6,7};
        addInMiddle(list,integers);
    }
}
