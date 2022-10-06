package codeup;

import java.util.Scanner;

public class _1093 {
    public static void main(String[] args) {
        int n;
        int arr[] = new int[23];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a;
            a= sc.nextInt();
            arr[a-1]++;
        }
        for(int i=0;i<23;i++){
            System.out.printf("%d ",arr[i]);
        }

    }
}
