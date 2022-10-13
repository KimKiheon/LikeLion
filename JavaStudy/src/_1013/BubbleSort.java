package _1013;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public int[] Bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = bs.Bubble(arr);
        System.out.println(Arrays.toString(result));
    }
}
