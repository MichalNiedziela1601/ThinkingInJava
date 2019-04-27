package typeinfo.pets;

public class Pet extends Individual implements Comparable<Pet> {
    private static int counter;
    private final int id = counter++;
    public Pet(String name) { super(name);}
    public Pet() { super();}
    public int id() { return id; }

    @Override
    public int compareTo(Pet o) {
        if(this.id == o.id) {
            return 0;
        }
        if(this.id < o.id) {
            return -1;
        }
        return 1;
    }
}
