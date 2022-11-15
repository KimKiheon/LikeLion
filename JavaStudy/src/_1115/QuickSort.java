package _1115;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = arr[(start+end)/2], left = start, right = end;
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if(left<=right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
                left++;
                right--;
            }

        }
        quickSort(arr, start, right);
        quickSort(arr, left, end);
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
