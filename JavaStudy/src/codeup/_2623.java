package codeup;

import java.util.Scanner;

public class _2623 {
    public static int Gcd(int a, int b) {
        if (b==0)return a;
        return Gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(Gcd(Math.max(a, b), Math.min(a, b)));
    }
}
