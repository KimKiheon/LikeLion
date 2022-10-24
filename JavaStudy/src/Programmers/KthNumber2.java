package Programmers;

import java.util.PriorityQueue;

public class KthNumber2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < commands.length; i++) {
            int left = commands[i][0] - 1, right = commands[i][1], n = commands[i][2];
            for (int j = left; j < right; j++) pq.add(array[j]);
            for (int j = 0; j < n; j++) answer[i] = pq.poll();
            pq.clear();
        }
        return answer;
    }
}
