package _1129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort {
    public Set<Integer> digit(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) set.add(1);
            else if (0<arr[i])set.add((int)(Math.floor(Math.log10(arr[i]))+1));
            else continue;
        }
        return set;
    }
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
