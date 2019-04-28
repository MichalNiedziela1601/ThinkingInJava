package collections;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        // identical
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        // Only differs in empty-list behavior
        System.out.println("pets.peek(): " + pets.peek());
        // Identical: remove and return first element;
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst() " + pets.removeFirst());
        // Only differs in empty list behavior
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Cat());
        System.out.println("After addFirst: " + pets);
        pets.offer(Pets.random());
        System.out.println("After offer: " + pets);
        pets.add(Pets.random());
        System.out.println("After add: " + pets);
        pets.addLast(Pets.random());
        System.out.println("After addLast: " +pets);
        System.out.println("pets.removeLast() : " + pets.removeLast());
    }
}
