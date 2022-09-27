package _0927.stack;

import java.util.Scanner;

public class Action {
    private int num;
    private Stack stack;

    public Action(int num, Stack stack) {
        this.num = num;
        this.stack = stack;
    }

    public void exe() {
        switch (num) {
            case 0:
                break;
            case 1:
                char input;
                Scanner sc = new Scanner(System.in);
                System.out.println("입력 값:");
                input = sc.next().charAt(0);
                stack.push(input);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.peek();
                break;
            case 4:
                stack.number();
                break;
            case 5:
                stack.isEmpty();
                break;
            case 6:
                stack.clear();
                break;
        }

    }

}
