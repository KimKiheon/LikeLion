package _1005.calculator;

public class Calculator {
    private int a, b;
    public Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple() {
        System.out.println(a * b);
    }

    public void divide() {
        double result = (double) a / b;
        System.out.println(result);
    }

}
