package typeinfo;

class Bulding {}
class House extends Bulding {}
public class ClassCasts {

    public static void main(String[] args) {
        Bulding b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b;
    }
}
