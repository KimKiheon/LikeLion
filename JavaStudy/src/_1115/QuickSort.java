package _1115;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = arr[(start+end)/2], left = start, right = end;
        while (left <= right) {
            while (arr[left] < pivot) left++; //pivot보다 큰 값을 만날 때까지 left++
            while (arr[right] > pivot) right--; //pivot보다 작은 값을 만날 때까지 right++

            if(left<=right){ //left와 right 인덱스에 있는 원소 교체 후, left+1 right-1
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
                left++;
                right--;
            }

        }
        quickSort(arr, start, right); //pivot기준 왼쪽 리스트 == 작은 값 리스트
        quickSort(arr, left, end);//pivot 기준 오른쪽 리스트
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
