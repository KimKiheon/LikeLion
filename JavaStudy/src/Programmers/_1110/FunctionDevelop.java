package Programmers._1110;

import java.util.ArrayList;

public class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int cur = 0, flag = 0;
        while (cur < progresses.length) {
            for (int i = cur; i < progresses.length; i++) {
                if (progresses[i] >= 100) continue;
                progresses[i] += speeds[i];
            }
            for (int i = cur; i < progresses.length; i++) {
                if (progresses[i] < 100) break;
                flag = i + 1;
            }
            if (flag != cur) {
                arrayList.add(flag - cur);
                cur = flag;
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
