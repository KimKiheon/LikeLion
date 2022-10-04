package _1004;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        int money;
        Scanner sc = new Scanner(System.in);
        System.out.println("금액: ");
        money = sc.nextInt();
        int coin[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int ans[] = new int[8];
        for (int i = 0; i < coin.length; i++) {
            ans[i] = money / coin[i];
            money %= coin[i];
            System.out.println(coin[i] + "원" + ans[i] + "개");
        }
    }
}
