package _1129;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 6, 5, 4, 1};
        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1);
        for (int i = 0; i < arr.length; i++) {
            radixArr[arr[i]] = arr[i];
        }
        int tmp = 0;
        for (int i = 0; i < radixArr.length; i++) {
            if (0 <= radixArr[i]) {
                arr[tmp] = radixArr[i];
                System.out.printf("%d ", arr[tmp]);
                tmp++;
            }
        }
    }
}
