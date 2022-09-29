package _0927.stack;

public class Stack implements Function {
    private int size, top = -1;
    private char arrayStack[];

    public Stack(int size) {
        this.size = size;
        this.arrayStack = new char[size];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    @Override
    public void push(char input) {
        if (top < size - 1) {
            arrayStack[++top] = input;
            System.out.println(input + "값을 스택에 넣었습니다");
        } else {
            System.out.println("스택이 가득 찼습니다");
        }

    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            arrayStack = new char[this.size];
            top = -1;
            System.out.println("스택 클리어 완료");
        } else {
            System.out.println("스택이 이미 비어있습니다");
        }

    }

    @Override
    public char pop() {
        if (!isEmpty()) {
            char tmp = arrayStack[top--];
            System.out.println(tmp + " 제거 완료");
            return tmp;

        } else {
            System.out.println("스택이 비어 있습니다");
            return 0;
        }
    }

    @Override
    public char peek() {
        if (!isEmpty()) {
            System.out.println("현재 스택의 top: " + arrayStack[top]);
            return arrayStack[top];
        } else {
            System.out.println("스택이 비어 있습니다");
            return 0;
        }
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("현재 스택에는 ");
            for (int i = 0; i < top + 1; i++) {
                System.out.printf("%c ", arrayStack[i]);
            }
            System.out.println("가 있습니다");
        }
    }

    @Override
    public void number() {
        System.out.println("현재 스택에는 " + (top + 1) + "개의 멤버가 있습니다");
    }
}