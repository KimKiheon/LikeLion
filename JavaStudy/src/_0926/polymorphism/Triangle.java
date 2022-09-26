package _0926.polymorphism;

public class Triangle extends Shape{
    public Triangle(){
        System.out.println("삼각형 생성");
    }
    @Override
    public void draw(){
        System.out.println("삼각형 그리기");
    }
}
