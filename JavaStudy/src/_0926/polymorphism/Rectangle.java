package _0926.polymorphism;

public class Rectangle extends Shape{
    public Rectangle(){
        System.out.println("사각형 생성");
    }
    @Override
    public void draw(){
        System.out.println("사각형 그리기");
    }
}
