package _1007.populationanalysis;

public class MoveCount {
    private int from[] = new int[100];
    private int to[] = new int[100];
    private int fromMax, toMax, fromMaxIdx=0, toMaxIdx=0;

    public MoveCount() {
        this.fromMax = from[0];
        this.toMax = to[0];
    }

    public void count(int fromNum, int toNum) {
        this.from[fromNum]++;
        this.to[toNum]++;
    }

    public void setMaxCount() {

        for (int i = 1; i < 40; i++) {
            if (fromMax < from[i]) {
                fromMax = from[i];
                fromMaxIdx = i;
            }
            if (toMax < to[i]) {
                toMax = to[i];
                toMaxIdx = i;
            }
        }
    }
    public int getFromMaxIdx(){
        return fromMaxIdx;
    }
    public int getToMaxIdx() {
        return toMaxIdx;
    }
}
