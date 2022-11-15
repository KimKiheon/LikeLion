package _1115;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = arr[start], left = start + 1, right = end;
        while (left <= right) {
            while (arr[left] <= pivot) left++;
            while (arr[right] >= pivot&&right>start) right--;

            if (left > right) {
                int tmp = arr[right];
                arr[right] = arr[start];
                arr[start] = tmp;
            } else {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }

        }
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
