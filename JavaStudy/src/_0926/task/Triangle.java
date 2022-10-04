package _0926.task;

class Triangle extends Shape {
    private double num1, num2;

    public Triangle() {
    }

    public Triangle(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double getArea() {
        return num1 * num2 / 2;
    }
}