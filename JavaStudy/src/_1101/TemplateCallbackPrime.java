package _1101;

public class TemplateCallbackPrime {
    boolean isPrime(int n, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(17, (a, b) -> a * a < b);
        System.out.println(r);
    }
}
