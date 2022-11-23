package _1123;

import java.util.Scanner;

public class FibonacciRecursion {
    static long Fibo(int n) {
        if (n == 0 || n == 1 || n == 2) return 1;
        return Fibo(n - 2) + Fibo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo(n));

    }
}
