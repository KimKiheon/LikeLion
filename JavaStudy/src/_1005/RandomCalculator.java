package _1005;

public class RandomCalculator implements CalculatorInterface{

    @Override
    public void plus(int a) {
        int b = (int) (Math.random() * 10);
        System.out.println(a + b);
    }

    @Override
    public void minus(int a) {
        int b = (int) (Math.random() * 10);
        System.out.println(a - b);
    }

    @Override
    public void multiple(int a) {
        int b = (int) (Math.random() * 10);
        System.out.println(a * b);
    }

    @Override
    public void divide(int a) {
        int b = (int) (Math.random() * 10);
        double result;
        if (b == 0) {
            System.out.println("랜덤값이 0입니다");
        } else {
            result = (double)a/b;
            System.out.println(result);
        }
    }


}
