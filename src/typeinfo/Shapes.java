package typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + " draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public boolean flag = false;
    public String toString() { return "Circle; flag = " + (flag ? "marked":"unmarked"); }
}

class Square extends Shape {
    public boolean flag = false;
    public String toString() { return "Square; flag = " + (flag ? "marked" : "unmarked");}
}

class Triangle extends Shape {
    public boolean flag = false;
    public String toString() {return "triangle; flag = " + (flag ? "marked" :"unmarked");}
}

class Rhomboid extends Shape {
    public boolean flag = false;
    public String toString() { return "Rhomboid; flag = " + (flag ? "marked" : "unmarked");}
}
public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for(Shape shape : shapes) {
            shape.draw();
        }

        Rhomboid rhombe = new Rhomboid();
        rhombe.draw();
        System.out.println("Before cast to up rhombe.instanceOf(Rhomboid): " + (rhombe instanceof Rhomboid));
        Shape s = (Shape) new Rhomboid();
        s.draw();
        System.out.println("After casting down s instanceof Rhomboid: " + (s instanceof Rhomboid));
        rhombe = (Rhomboid)s;
        rhombe.draw();

        List<Shape> shapes1 = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape: shapes1) {
            rotate(shape);
        }

        System.out.println("Mark Circle shapes");

        for(Shape shape: shapes1) {
            setCircleFlag(shape);
            System.out.println(shape);
        }

        System.out.println("Reset flag");

        for(Shape shape : shapes1) {
            resetFlag(shape);
        }

        System.out.println("Mark Square shapes");

        for(Shape shape : shapes1) {
            setSquareFlag(shape);
            System.out.println(shape);
        }
        

    }

    static void rotate(Shape shape) {
        if(shape.getClass().getSimpleName().equals("Circle")) {
            System.out.println("Can't rotate Circle");
            return;
        }
        System.out.println(shape + " rotate");
    }

    static void setCircleFlag(Shape shape) {
        if(shape instanceof Circle) {
            ((Circle)shape).flag = true;
        }
    }

    static void setSquareFlag(Shape shape) {
        if(shape instanceof Square) {
            ((Square)shape).flag = true;
        }
    }

    static void resetFlag(Shape shape) {
        if(shape instanceof Circle) {
            ((Circle)shape).flag = false;
        }
        if(shape instanceof Square) {
            ((Square)shape).flag = false;
        }
    }
}
