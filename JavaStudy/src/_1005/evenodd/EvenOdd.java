package _1005.evenodd;

public class EvenOdd {
    private WordMaker wordMaker;

    public EvenOdd(WordMaker wordMaker) {
        this.wordMaker = wordMaker;
    }

    public void result(int num1, int num2) {
        System.out.println(wordMaker.getWord(num1) + "+" + wordMaker.getWord(num2)
                + "=" + wordMaker.getWord(num1 + num2));
    }
}
