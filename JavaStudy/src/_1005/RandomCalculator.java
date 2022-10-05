package _1005;

public class RandomCalculator implements CalculatorInterface{

    private int b = (int) (Math.random() * 10);

    @Override
    public void plus(int a) {
        System.out.println(a + b);
    }

    @Override
    public void minus(int a) {
        System.out.println(a - b);
    }

    @Override
    public void multiple(int a) {
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
