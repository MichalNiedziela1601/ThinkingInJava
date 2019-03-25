package generics.lab;

import generics.Holder3;
import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

public class Lab1 {

  public static void main(String[] args) {
    //
      Holder3<Pet> petHolder = new Holder3<>(new Pet());
    System.out.println(petHolder.get().getClass().getSimpleName());
    petHolder.set(new Dog());
      System.out.println(petHolder.get().getClass().getSimpleName());
    petHolder.set(new Cat());
      System.out.println(petHolder.get().getClass().getSimpleName());

  }
}
