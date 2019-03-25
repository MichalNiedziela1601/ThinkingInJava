package generics.lab;

import typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;

class B1 {
    private String name;

    public B1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B1{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Holder4<T> {
    private T a, b, c;

    public Holder4(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() { return a;}
    public T getB() { return b;}
    public T getC() { return c;}

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void setC(T c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Holder4{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class Lab2 {

  public static void main(String[] args) {
    Holder4<B1> b1Holder4 = new Holder4<>(new B1("B1A"), new B1("B1B"), new B1("B1C"));
    System.out.println(b1Holder4);
    System.out.println(b1Holder4.getA());
    System.out.println(b1Holder4.getB());
    System.out.println(b1Holder4.getC());
  }
}
