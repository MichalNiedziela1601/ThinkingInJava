package typeinfo.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> factoriesPart = new ArrayList<Class<? extends Part>>();

    static {
        factoriesPart.add(FuelFilter.class);
        factoriesPart.add(AirFilter.class);
        factoriesPart.add(CabinAirFilter.class);
        factoriesPart.add(OilFilter.class);
        factoriesPart.add(FanBelt.class);
        factoriesPart.add(GeneratorBelt.class);
        factoriesPart.add(PowerSteeringBelt.class);
    }

    private static Random random = new Random(47);
    public static Part createRandom() {
        int n = random.nextInt(factoriesPart.size());
        try {
            return factoriesPart.get(n).newInstance();
        } catch(InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {

    public static class Factory implements typeinfo.factory.Factory<FuelFilter> {
        public FuelFilter create(){return new FuelFilter();}
    }

}

class AirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter();}
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() { return new CabinAirFilter();}
    }
}

class OilFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter();}
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() { return new GeneratorBelt();}
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() { return new PowerSteeringBelt();}
    }
}

public class Lab14 {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}


