package _1208;

public class FibonacciDP {
    public static void main(String[] args) {
        int[] dp = new int[50];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[20]);
    }
}
