package _0927.interface1;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다");

    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }
}
