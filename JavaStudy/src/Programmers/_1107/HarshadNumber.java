package Programmers._1107;

public class HarshadNumber {
    public boolean solution(int x) {
        int tmp = x, sum = 0;
        while (0 < x) {
            sum += x % 10;
            x /= 10;
        }
        if (tmp % sum == 0)return true;
        else return false;
    }
}
