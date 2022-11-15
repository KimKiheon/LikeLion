package Programmers._1110;
import java.util.*;

public class HateSameNumber {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arrayList.get(arrayList.size() - 1)) {
                arrayList.add(arr[i]);
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
