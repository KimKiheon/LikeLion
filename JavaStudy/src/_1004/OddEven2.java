package _1004;

import java.util.Scanner;

public class OddEven2 {
    public String IsEvenOdd(int num) {
        if (num % 2 == 1) return "홀수";
        else return "짝수";
    }

    public void printEvenOdd(int num1, int num2) {
        System.out.printf("%s+%s=%s", IsEvenOdd(num1), IsEvenOdd(num2), IsEvenOdd(num1 + num2));
    }

    public static void main(String[] args) {
        int input1, input2;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        OddEven2 main = new OddEven2();
        main.printEvenOdd(input1, input2);
    }
}
