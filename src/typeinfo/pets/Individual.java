package typeinfo.pets;

public class Individual {

    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }

    public String getName() { return name; }
    public String toString() { return getClass().getSimpleName(); }
}
