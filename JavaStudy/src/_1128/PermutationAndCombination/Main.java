package _1128.PermutationAndCombination;

public class Main {
    void function1() {
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c\n", 'A' + i);
        }
    }

    void function2() {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.printf("%c%c\n", 'A' + i, 'A' + j);
            }
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.function1();
        m.function2();
    }
}
