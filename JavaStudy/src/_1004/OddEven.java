package _1004;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if(input%2==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
