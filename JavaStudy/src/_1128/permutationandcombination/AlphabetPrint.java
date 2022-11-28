package _1128.permutationandcombination;

public class AlphabetPrint {
    void function1() {
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c\n", i + 'A');
        }
    }

    void function2() {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.printf("%c%c\n", i + 'A', j + 'A');
            }
        }
    }

    public static void main(String[] args) {
        AlphabetPrint alphabetPrint = new AlphabetPrint();
        alphabetPrint.function1();
        alphabetPrint.function2();
    }

}
