package _0926.task;

public class Triangle extends Shape {
    private double width = 0, height = 0;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }
}
