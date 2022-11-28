package _1128.permutationandcombination;

public class AlphabetPrintRecursion {
    static int[] arr = new int[26];

    void function1(int n) {
        if (n == 26) return;
        System.out.printf("%c\n", n + 'A');
        function1(n + 1);
    }

    void function2(int idx, int n, int depth) {
        if (idx == depth) {
            for (int i = 0; i < 2; i++) System.out.printf("%c", arr[i] + 'A');
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[idx] = i;
            function2(idx + 1,n,depth);
            arr[idx] = 0;
        }

    }

    public static void main(String[] args) {
        AlphabetPrintRecursion alphabetPrintRecursion = new AlphabetPrintRecursion();

        alphabetPrintRecursion.function1(0);
        alphabetPrintRecursion.function2(0, 26, 2);
    }
}
