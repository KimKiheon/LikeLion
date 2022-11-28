package _1128.permutationandcombination;

public class AlphabetPrintRecursion {
    static int[] arr = new int[26];

    void function(int idx, int n, int depth) {
        if (idx == depth) {
            for (int i = 0; i < depth; i++) System.out.printf("%c", arr[i] + 'A');
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[idx] = i;
            function(idx + 1, n, depth);
            arr[idx] = 0;
        }
    }
    public static void main(String[] args) {
        AlphabetPrintRecursion alphabetPrintRecursion = new AlphabetPrintRecursion();

        alphabetPrintRecursion.function(0,26,1);
        alphabetPrintRecursion.function(0, 26, 2);
        alphabetPrintRecursion.function(0,26,3);
    }
}
