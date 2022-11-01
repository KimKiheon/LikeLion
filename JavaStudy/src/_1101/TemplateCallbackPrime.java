package _1101;

public class TemplateCallbackPrime {
    boolean someOperation(int a, int b){
        return a < b;
    }

    boolean isPrime(int n) {
        for (int i = 2;someOperation(i,n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}
