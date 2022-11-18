package Programmers._1118;

public class CaesarCipher {
    public String solution(String s, int n) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if ('A' <= c && c <= 'Z') {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            result += c;
        }
        return result;
    }
}
