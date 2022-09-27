package _0927.stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("스택 사이즈 입력:");
        size = sc.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            int num;
            System.out.println("0: Stop 1: push 2: pop 3: peek 4: number of stack member 5: isEmpty 6: clear");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("종료되었습니다");
                break;
            }
            Action action = new Action(num, stack);
            action.exe();
            stack.printStack();
        }

    }

}
