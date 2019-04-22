package collections;

import typeinfo.pets.*;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(48);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets );
        Cat cat = new Cat();
        pets.add(cat);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(cat));
        pets.remove(cat);
        Pet p = pets.get(2);
        System.out.println("4: " + p +" " +pets.indexOf(p));
        Pet c = new Mruk();
        System.out.println("5: " + pets.indexOf(c));
        System.out.println("6: " + pets.remove(c));
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mutt());
        System.out.println("9: " + pets);
        List<Pet> sub = pets.subList(1,4);
        System.out.println("sublist: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
//        Collections.sort(sub);
        System.out.println("sorted sublist: " + sub);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " +copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new Mutt());
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].getName());
    }
}
