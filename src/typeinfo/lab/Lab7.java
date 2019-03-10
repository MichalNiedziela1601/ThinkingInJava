package typeinfo.lab;

class Candy {
    @Override
    public String toString() {
        return "Candy{}";
    }
}

class Drops {
    @Override
    public String toString() {
        return "Drops{}";
    }
}


public class Lab7 {

    public static void main(String[] args){

        if(args.length < 1) {
            System.out.println("Please add argument to crete class like: Lab7 Candy");
            System.exit(0);
        }

        for(String arg : args) {
            try {
                Class c = Class.forName("typeinfo.lab."+arg);
                System.out.println(c.getSimpleName());
                System.out.println(c.getCanonicalName());
            } catch (ClassNotFoundException e) {
                System.out.println("Can't find class " + arg);
            }

        }
    }
}
