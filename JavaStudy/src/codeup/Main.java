package codeup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n=sc.nextInt();
        key=sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == key) {
                System.out.println(mid + 1);
                return;
            } else if (numbers[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(-1);
    }
}

