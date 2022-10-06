package _1006.map;

import java.util.HashMap;

public class AlphabetCountMain {
    public static void main(String[] args) {
        String gitRepos = "https://github.com/KimKiheon/LikeLion/tree/main/JavaStudy/src/_1006";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        for (int i = 0; i < gitRepos.length(); i++) {

            char c = gitRepos.charAt(i);
            if ('a' <= c && c <= 'z') {
                c += 32;
            }
            if ('A' <= c && c <= 'Z') {
                if (alphabetCnt.get(c) == null) {
                    alphabetCnt.put(c, 1);
                } else {
                    alphabetCnt.put(c, alphabetCnt.get(c) + 1);
                }
            }
        }
        for (int i = 97; i <= 122; i++) {
            System.out.printf("%c : %d\n", i, alphabetCnt.get((char) i));
        }
    }
}