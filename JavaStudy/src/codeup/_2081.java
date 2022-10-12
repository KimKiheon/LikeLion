package codeup;

import java.util.Scanner;

public class _2081 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int ans = 0, maxidx = -1;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > ans) {
                ans = arr[i];
                maxidx = i + 1;
            }
        }
        System.out.println(ans);
        System.out.println(maxidx);
    }
}
