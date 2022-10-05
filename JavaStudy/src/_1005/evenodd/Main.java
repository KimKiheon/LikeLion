package _1005.evenodd;

public class Main {
    public static void main(String[] args) {
        WordMaker koreanWordMake = new KoreanWordMaker();
        EvenOdd kEvenOdd = new EvenOdd(koreanWordMake);
        EvenOdd eEvenOdd = new EvenOdd(new EnglishWordMaker());

        kEvenOdd.result(4,1);
        eEvenOdd.result(3,2);
    }
}
