package codeup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String[] array = s.split("-");

        System.out.printf("%s%s", array[0], array[1]);

    }
}
