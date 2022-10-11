package _1007.populationanalysis;

public class NumberPrint {
    private int from, to;
    private String fromCity, toCity;

    public NumberPrint(int from, int to) {
        this.from = from;
        this.to = to;
        CodeToCity codeToCity = new CodeToCity();
        fromCity = codeToCity.getCity(this.from);
        toCity = codeToCity.getCity(this.to);
    }

    public void print() {
        System.out.println("전출 Max 도시:" + fromCity);
        System.out.println("전입 Max 도시:" + toCity);
    }
}
