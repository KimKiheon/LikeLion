package codeup;

import java.util.Scanner;

public class _3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
