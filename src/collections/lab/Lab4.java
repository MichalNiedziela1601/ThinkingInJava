package collections.lab;

import net.mindview.util.Generator;

import java.util.*;

class Characters implements Generator<String> {

    private List<String> characters = Arrays.<String>asList("Leia","Albert","Mike","Harvey","Fiona");
    private int index = 0;
    @Override
    public String next() {
        return characters.get(index++);
    }

    public boolean isEnd() {
        return index == characters.size();
    }



}

public class Lab4 {

    static Collection fill(Collection<String> collection) {
        Characters characters = new Characters();
        while (!characters.isEnd()) {
            collection.add(characters.next());
        }
        return collection;
    }

  public static void main(String[] args) {
    System.out.println(fill(new ArrayList<>()));
    System.out.println(fill(new LinkedList<>()));
    System.out.println(fill(new HashSet<>()));
    System.out.println(fill(new LinkedHashSet<>()));
    System.out.println(fill(new TreeSet<>()));
  }
}
