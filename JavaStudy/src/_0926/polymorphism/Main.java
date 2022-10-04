package _0926.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape shape2 = new Triangle();
        shape2.draw();
    }
}
