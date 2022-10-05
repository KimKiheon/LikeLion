package _1005.evenodd;

public class EnglishWordMaker implements WordMaker{

    @Override
    public String getWord(int num) {
        if(num%2==0) return "even";
        else return "odd";
    }
}
