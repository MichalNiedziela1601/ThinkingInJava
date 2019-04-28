package collections;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        System.out.println();
        // Backwards
        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.random());
        }
        System.out.println(pets);
    }
}
