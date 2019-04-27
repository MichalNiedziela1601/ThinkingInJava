package collections.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyClass {
    private static int counter;
    private final int id;

    public MyClass() {
        id = counter++;
    }
    public String toString() {
        return getClass().getSimpleName() + "[" + id + "]";
    }
}
public class Lab7 {
  public static void main(String[] args) {
    //
      List<MyClass> myClasses = new ArrayList<>(Arrays.asList(new MyClass(), new MyClass(), new MyClass(), new MyClass(), new MyClass()));
      List<MyClass> myClasses1 = myClasses.subList(1, 3);
    System.out.println("1: " + myClasses);
    System.out.println("2: " + myClasses1);
      myClasses.removeAll(myClasses1);
    System.out.println("3: " + myClasses);
  }
}
