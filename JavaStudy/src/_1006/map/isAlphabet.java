package _1006.map;

public class isAlphabet {
    private char c;
    public isAlphabet(char c){
        this.c=c;
    }
    public boolean alphabetDecide(){
        if(65<=c&&c<=90){
            return true;
        }else if(97<=c&&c<=122) {
            return true;
        }else{
            return false;
        }
    }
}
