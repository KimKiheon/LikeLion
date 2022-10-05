package codeup;

import java.util.Scanner;

public class _1019 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String[] array = s.split("-");
        int a = Integer.valueOf(array[0]);
        int b = Integer.valueOf(array[1]);
        int c = Integer.valueOf(array[2]);
        System.out.printf("%04d.%02d.%02d", a, b, c);

    }
}
