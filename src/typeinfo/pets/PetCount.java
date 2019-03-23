package typeinfo.pets;

import java.util.ArrayList;
import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if(quantity == null) {
                put(type,1);
            } else {
                put(type, quantity +1);
            }
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();

        ArrayList<Pet> pets = creator.arrayList(10);
        for(Pet pet : pets) {
            if(pet instanceof Pet) {
                counter.count("Pet");
            }
            if(pet instanceof Dog) {
                counter.count("Dog");
            }
            if(pet instanceof Cat) {
                counter.count("Cat");
            }
            if(pet instanceof  EgyptianMau) {
                counter.count("EgyptianMau");
            }
            if(pet instanceof Mutt) {
                counter.count("Mutt");
            }
            if(pet instanceof Mruk) {
                counter.count("Mruk");
            }
            if(pet instanceof Zin) {
                counter.count("Zin");
            }
            if(pet instanceof Gerbil) {
                counter.count("Gerbil");
            }
        }

        System.out.println();
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
