package codeup;

import java.util.Scanner;

public class _1033 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        String s = Integer.toHexString(n).toUpperCase();
        System.out.println(s);
    }
}
