package typeinfo.lab;

import java.lang.reflect.Field;

class Parent {
    public String name;
    protected String surname;
}

class Child extends Parent {
    public int age;
}

class Grandson extends Child {
    public int toysNumber;
}

public class Lab8 {

    public static void main(String[] args) {
            showInheritance(new Grandson());
    }

    public static void showInheritance(Object cc) {
        if(cc.getClass().getSuperclass() != null) {

            System.out.println(cc.getClass()+ ", superclass " + cc.getClass().getSuperclass());
            for(Field field : cc.getClass().getDeclaredFields()) {
                System.out.println("Field name: " + field);
            }

            try {
                showInheritance(cc.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("Can't create new instance of " + cc.getClass());
                System.exit(1);
            } catch (IllegalAccessException e) {
                System.out.println("Access denied");
                System.exit(1);
            }
        } else {
            System.out.println("No more parents");
            System.exit(1);
        }
    }
}
