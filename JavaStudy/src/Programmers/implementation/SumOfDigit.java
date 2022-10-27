package Programmers.implementation;

public class SumOfDigit {
    public int solution(int n) {
        int answer = 0;
        while (0 < n) {
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1==10){
            System.out.printf("정답");
        }
        else{
            System.out.printf("실패");
        }
    }
}