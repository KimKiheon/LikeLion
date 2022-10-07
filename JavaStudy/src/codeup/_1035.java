package codeup;

import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        int n = Integer.parseInt(s,16);
        System.out.printf("%o",n);
    }
}
