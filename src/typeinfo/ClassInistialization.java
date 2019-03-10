package typeinfo;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInistialization.rand.nextInt(1000);

    static {
        System.out.println("Inicjalizacja klasy Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Inicjalizacja klasy Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Inicjalizacja klasy Initable3");
    }
}

public class ClassInistialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After created reference Initable");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("typeinfo.Initable3");
        System.out.println("Po utworzeniu referencji Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
