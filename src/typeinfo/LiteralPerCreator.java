package typeinfo;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPerCreator extends PetCreator {

    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.<Class<? extends Pet>>asList(
            Pet.class, Dog.class, Cat.class, Mutt.class, EgyptianMau.class, Mruk.class, Zin.class
    ));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
