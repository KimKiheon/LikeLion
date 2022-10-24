package Programmers;

import java.util.Arrays;
import java.util.Comparator;

class BiggestNumber {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++)
            s[i] = String.valueOf(numbers[i]);

        Arrays.sort(s, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.charAt(0) == s2.charAt(0)) {
                    int n1 = Integer.parseInt(s1 + s2);
                    int n2 = Integer.parseInt(s2 + s1);
                    return n2 - n1;
                }
                return s2.charAt(0) - s1.charAt(0);
            }
        });

        for (int i = 0; i < s.length; i++) sb.append(s[i]);

        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}