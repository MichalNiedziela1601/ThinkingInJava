package collections.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lab8 {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>(Arrays.asList(new Gerbil(), new Gerbil(), new Gerbil(), new Gerbil()));
        Iterator<Gerbil> it = gerbils.iterator();

        while (it.hasNext()) {
            it.next().hop();
        }
    }
}
