package collections.lab;

import java.util.ArrayList;

class Gerbil {
    private static int counter;
    private int gerbilNumber;

    Gerbil() {
        gerbilNumber = counter++;
    }
    public void hop() {
        System.out.println("Gerbil number: " + gerbilNumber);
    }
}
public class Lab1 {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i =0; i < 5; i++) {
            gerbils.add(new Gerbil());
        }
        for(Gerbil g : gerbils) {
            g.hop();
        }
    }
}
