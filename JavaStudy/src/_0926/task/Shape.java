package _0926.task;

public class Shape {
    private double height, width;

    public Shape() {
    }

    public Shape(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}
