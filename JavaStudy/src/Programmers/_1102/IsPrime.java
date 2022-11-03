package Programmers._1102;

public class IsPrime {
    public int solution(int n) {
        int answer = 0;
        int[] primeNum = new int[1000005];
        for (int i = 2; i <= n; i++) primeNum[i] = i;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeNum[i] == 0) continue;
            for (int j = i * i; j <= n; j += i) {
                primeNum[j] = 0;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primeNum[i] == i) answer++;
        }
        return answer;
    }
}


