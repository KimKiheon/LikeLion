package _0926.task;

class Shape {
    private double num1, num2;

    public Shape(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Shape() {

    }

    public double getArea() {
        return num1 * num2;
    }
}