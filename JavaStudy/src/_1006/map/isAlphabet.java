package _1006.map;

public class isAlphabet {

    public boolean isAlphabet(char c) {
        if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
            return true;
        } else
            return false;
    }
}
