package typeinfo.pets;

public class Pet extends Individual {
    private static int counter;
    private final int id = counter++;
    public Pet(String name) { super(name);}
    public Pet() { super();}
    public int id() { return id; }
}
