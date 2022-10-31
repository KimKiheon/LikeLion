package Programmers.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MockTest {
    class Solution {
        public int[] solution(int[] answers) {
            int[] n1 = {1, 2, 3, 4, 5};
            int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int maxi = 0;
            int[] sum = {0, 0, 0};
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == n1[i % 5]) sum[0]++;
                if (answers[i] == n2[i % 8]) sum[1]++;
                if (answers[i] == n3[i % 10]) sum[2]++;
            }
            maxi = Math.max(sum[0], Math.max(sum[1], sum[2]));
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) if (maxi == sum[i]) list.add(i + 1);
            int[] answer = new int[list.size()];
            int cnt = 0;
            for (int num : list) answer[cnt++] = num;
            return answer;
        }
    }
}
