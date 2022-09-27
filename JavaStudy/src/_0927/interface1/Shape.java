package _0927.interface1;

public interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.println("---다시 그림---");
        draw();
    }
}
