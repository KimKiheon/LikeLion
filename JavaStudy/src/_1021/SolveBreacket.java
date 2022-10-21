package _1021;

public class SolveBreacket {
    public static void main(String[] args) {
        String s = "()()(((((";
        System.out.println(solution(s));

    }

    static boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            }

            if (s.charAt(i) == ')') {
                cnt--;
            }

            if (cnt < 0) {
                answer = false;
                return answer;
            }
        }
        if (cnt > 0) {
            answer = false;
        } else {
            answer = true;
        }

        return answer;
    }
}
