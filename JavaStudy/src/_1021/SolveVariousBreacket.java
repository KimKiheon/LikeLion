package _1021;

import java.util.EmptyStackException;
import java.util.Stack;

public class SolveVariousBreacket {
    public static boolean solve(String s){
        Stack<Character> st= new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    st.push(c);
                } else {
                    char temp = st.pop();
                    if (temp == '(') {
                        if (temp != c - 1) { // 아스키 코드 차이
                            return false;
                        }
                    } else if (temp == '{' || temp == '[') {
                        if (temp != c - 2) {
                            return false;
                        }
                    }
                }
            }
        }catch (EmptyStackException | StackOverflowError e2){
            return false;
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        //[{()}]
    }
    public static void main(String[] args) {
        String s1 = "[{()}]";
        System.out.println(solve(s1));
        //true
        String s2 = "[[[{{}}()()]]]";
        System.out.println(solve(s2));
        //true
        String s3 = "{()}{()})";
        System.out.println(solve(s3));
        //false
        String s4 = "[([()])]";
        System.out.println(solve(s4));
        //true
        String s5 = "}}}}}";
        System.out.println(solve(s5));
        String s6 = "()([){}";
        System.out.println(solve(s6));

    }
}
