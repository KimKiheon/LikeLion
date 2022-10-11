package codeup;

import java.util.Scanner;

public class _1050 {
    public static void main(String[] args) {
        int a, b, flag;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) flag = 1;
        else flag = 0;
        System.out.println(flag);
    }
}
