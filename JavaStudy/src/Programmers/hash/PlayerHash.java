package Programmers.hash;

import java.util.HashMap;

public class PlayerHash {
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }

        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
