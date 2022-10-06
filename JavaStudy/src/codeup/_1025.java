package codeup;

import java.util.Scanner;

public class _1025 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            for (int j = 0; j < s.length() - i - 1; j++) {
                tmp += '0';
            }
            System.out.printf("[%s]\n", tmp);
        }
    }
}
