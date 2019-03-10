package typeinfo.toys;


interface HasBatteries {}
interface Waterprof {}
interface Shoots {}
interface ForBoys {}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterprof, Shoots, ForBoys {
    FancyToy() {
        super(1);
    }
}
public class ToyTest {

    static void printinfo(Class cc){
        System.out.println("Class name: " + cc.getName() + ", interface? ["+cc.isInterface() +"]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Cannonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find class FancyToy");
            System.exit(1);
        }
        printinfo(c);
        for(Class face : c.getInterfaces())
            printinfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Can't create new instance");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Access denied");
            System.exit(1);
        }
        printinfo(obj.getClass());
    }
}
