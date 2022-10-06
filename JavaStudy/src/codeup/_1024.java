package codeup;

import java.util.Scanner;

public class _1024 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.printf("'%c'\n", s.charAt(i));
        }
    }
}
