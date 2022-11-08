package _1108;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int left = 0, right = numbers.length - 1;
        int key = 7;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == key) {
                System.out.println(mid + "인덱스에 key값이 있습니다");
                break;
            } else if (numbers[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
