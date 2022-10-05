package _1005.calculator2;

public class Calculator {
    NumberGenerator numberGenerator;
    private int baseNum;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.baseNum = 10;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }


    public void plus() {
        System.out.println(10 + numberGenerator.generate(this.baseNum));
    }
}
