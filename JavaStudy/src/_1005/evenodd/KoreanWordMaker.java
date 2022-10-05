package _1005.evenodd;

public class KoreanWordMaker implements WordMaker {
    public String getWord(int num){
        if(num%2==0)return "짝수";
        else return "홀수";
    }
}
