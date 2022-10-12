package codeup;

import java.util.Scanner;

public class _4596 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);
        int ans = 0, maxrow = -1, maxcol = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (ans < arr[i][j]) {
                    ans = arr[i][j];
                    maxrow = i + 1;
                    maxcol = j + 1;
                }
            }
        }
        System.out.println(ans);
        System.out.println(maxrow + " " + maxcol);
    }
}
