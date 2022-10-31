package Programmers.hash;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mask {
    class Solution {
        public int solution(String[][] clothes) {
            int cnt[] = new int[35];
            int count = 1, tmp = 1;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < clothes.length; i++) {
                list.add(clothes[i][1]);
            }
            Collections.sort(list);
            cnt[0]++;
            for (int i = 1; i < list.size(); i++) {
                if (!(list.get(i).equals(list.get(i - 1)))) {
                    count++;
                }
                cnt[count - 1]++;
            }
            for (int i = 0; i < count; i++) tmp = tmp * (cnt[i] + 1);
            return tmp - 1;
        }
    }
}