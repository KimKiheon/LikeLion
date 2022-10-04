package _0926.task;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Rectangle(10.0, 20.0);
        shape[1] = new Triangle(10.0, 20.0);

        double sum = 0;

        for (Shape s : shape) {
            sum += s.getArea();
        }
        System.out.println("넓이의 합:" + sum);
    }
}
