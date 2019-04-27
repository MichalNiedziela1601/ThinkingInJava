package collections.lab;


import java.util.*;

public class Lab5 {
  public static void main(String[] args) {
    //
      Random rand = new Random(48);
      List<Integer> pets = new ArrayList<>(Arrays.asList(1,4,7,0,9,12));
      System.out.println("1: " + pets );
      Integer cat = new Integer(30);
      pets.add(cat);
      System.out.println("2: " + pets);
      System.out.println("3: " + pets.contains(cat));
      pets.remove(cat);
      Integer p = pets.get(2);
      System.out.println("4: " + p +" " +pets.indexOf(p));
      Integer c = new Integer(4);
      System.out.println("5: " + pets.indexOf(c));
      System.out.println("6: " + pets.remove(c));
      System.out.println("7: " + pets.remove(p));
      System.out.println("8: " + pets);
      pets.add(3, new Integer(70));
      System.out.println("9: " + pets);
      List<Integer> sub = pets.subList(1,4);
      System.out.println("sublist: " + sub);
      System.out.println("10: " + pets.containsAll(sub));
//        Collections.sort(sub);
      System.out.println("sorted sublist: " + sub);
      System.out.println("11: " + pets.containsAll(sub));
      Collections.shuffle(sub, rand);
      System.out.println("shuffled subList: " + sub);
      System.out.println("12: " + pets.containsAll(sub));
      List<Integer> copy = new ArrayList<>(pets);
      sub = Arrays.asList(pets.get(1), pets.get(4));
      System.out.println("sub: " + sub);
      copy.retainAll(sub);
      System.out.println("13: " +copy);
      copy = new ArrayList<Integer>(pets);
      copy.remove(2);
      System.out.println("14: " + copy);
      copy.removeAll(sub);
      System.out.println("15: " + copy);
      copy.set(1, new Integer(80));
      System.out.println("16: " + copy);
      copy.addAll(2, sub);
      System.out.println("17: " + copy);
      System.out.println("18: " + pets.isEmpty());
      pets.clear();
      System.out.println("19: " + pets);
      System.out.println("20: " + pets.isEmpty());
      pets.addAll(Arrays.asList(100,105,107,109));
      System.out.println("21: " + pets);
      Object[] o = pets.toArray();
      System.out.println("22: " + o[3]);
  }
}
