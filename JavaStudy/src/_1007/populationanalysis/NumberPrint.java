package _1007.populationanalysis;

public class NumberPrint {
    private int from, to;

    public NumberPrint(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void print() {
        System.out.println("전출 Max 도시:" + from);
        System.out.println("전입 Max 도시: " + to);
    }
}
