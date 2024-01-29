class Shape {
    // Overridden method
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.draw();

        Shape circle = new Circle();

        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
