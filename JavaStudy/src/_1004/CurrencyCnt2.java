package _1004;

import java.util.Scanner;

public class CurrencyCnt2 {
    public static void main(String[] args) {
        int refund=25000;
        int curren50000=50000;
        int curren10000=10000;
        int curren5000=5000;
        int curren1000=1000;
        System.out.printf("50000원 :%d 나머지 %d\n",refund/curren50000,refund%curren50000);
        refund%=curren50000;
        System.out.printf("10000원 :%d 나머지 %d\n",refund/curren10000,refund%curren10000);
        refund%=curren10000;
        System.out.printf("5000원 :%d 나머지 %d\n",refund/curren5000,refund%curren5000);
        refund%=curren5000;
        System.out.printf("1000원 :%d 나머지 %d\n",refund/curren1000,refund%curren1000);
        refund%=curren1000;


    }
}
