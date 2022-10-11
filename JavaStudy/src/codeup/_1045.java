package codeup;

import java.util.Scanner;

public class _1045 {
    public static void main(String[] args) {
        long a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f", (double)a / b);
    }
}
