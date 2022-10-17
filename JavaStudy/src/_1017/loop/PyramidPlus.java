package _1017.loop;

public class PyramidPlus {
    public void pyramidPlusPrint(int n) {
        Pyramid pyramid = new Pyramid();
        pyramid.pyramidPrint(n / 2 + 1);
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < n - 2 * (i + 1); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
