package Programmers._1107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DivisibleNumberListPriorityQueue {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) pq.add(arr[i]);
        }
        if (pq.size() == 0) return new int[]{-1};
        int[] answer = new int[pq.size()];
        int pqSize = pq.size();
        for (int i = 0; i < pqSize; i++) answer[i] = pq.poll();
        return answer;
    }
}
