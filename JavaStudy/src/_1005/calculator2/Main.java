package _1005.calculator2;

public class Main {
    public static void main(String[] args) {
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(randomNumberGenerator);
        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        specificNumberCalculator.plus();
        randomNumberCalculator.plus();

    }
}
