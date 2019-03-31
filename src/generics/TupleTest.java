package generics;

import typeinfo.pets.Pet;

public class TupleTest {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("Hej", 44);
    }
    static ThreeTuple<Pet, String, Integer> g() {
        return new ThreeTuple<>(new Pet(), "Hej", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();
        ThreeTuple<Pet, String, Integer> g = g();

    System.out.println(f);
    System.out.println(f());
    System.out.println(g());
    }
}
