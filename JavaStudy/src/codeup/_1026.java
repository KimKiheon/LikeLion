package codeup;

import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String[] array = s.split(":");
        if (array[1].length()>1&&array[1].charAt(0)=='0')
            array[1]= String.valueOf(array[1].charAt(0));
        System.out.println(array[1]);
    }
}
