package _1109;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 36, 3, 38, 22, 14, 27};
        int min, minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            min = (int) 2e9;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
