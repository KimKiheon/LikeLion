package Programmers._1107;

import java.util.ArrayList;
import java.util.Collections;


public class DivisibleNumberList {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tmp = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) tmp.add(arr[i]);
        }
        int[] temp = {-1};
        if (tmp.size() == 0) return temp;
        Collections.sort(tmp);
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) answer[i] = tmp.get(i);
        return answer;
    }
}
