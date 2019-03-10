package typeinfo.toys;

public class GenericToyTest {

    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // generowanie obiektu dokładnego typu
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // Nie da się skompilować
//        Class<Toy> up2 = ftClass.getSuperclass();
        // Zwraca jedynie egzemplarz Object
        Object obj = up.newInstance();
    }
}
