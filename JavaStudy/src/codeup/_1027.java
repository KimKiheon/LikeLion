package codeup;

import java.util.Scanner;

public class _1027 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String[] array = s.split("\\.");
        System.out.printf("%s-%s-%s",array[2],array[1],array[0]);
    }
}
