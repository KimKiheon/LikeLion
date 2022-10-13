package codeup;

import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println(Math.min(a,Math.min(b,c)));
    }
}
