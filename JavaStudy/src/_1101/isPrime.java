package _1101;

public class isPrime {

    boolean isPrime1(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    boolean isPrime2(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    boolean isPrime3(int n) {
        if (n == 2) return true;
        if (n == 1 || n % 2 == 0) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
