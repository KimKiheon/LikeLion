package Programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiscController {
    public int solution(int[][] jobs) {
        int s = jobs.length;
        int total, i, cur;
        total = i = cur = 0;

        Arrays.sort(jobs, (Comparator.comparingInt(arr -> arr[0])));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        while (s > 0) {
            while (i < jobs.length && jobs[i][0] <= cur) pq.offer(jobs[i++]);

            if (pq.isEmpty()) {
                cur = jobs[i][0];
            } else {
                int[] request = pq.poll();
                total += cur - request[0] + request[1];
                cur += request[1];
                s--;
            }
        }
        return total/jobs.length;
    }
}
