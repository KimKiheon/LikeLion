package Programmers;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.Factorial(5));
    }
    public int Factorial(int n){
        if(n==1)return 1;

        return n*Factorial(n-1);
    }
}
