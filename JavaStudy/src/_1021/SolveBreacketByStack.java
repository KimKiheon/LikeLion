package _1021;

import java.util.Stack;

public class SolveBreacketByStack {
    public static boolean solve(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length();i++){
            try {
                if (s.charAt(i) == '(') {
                    st.push('(');
                }
                if (s.charAt(i) == ')') {
                    st.pop();
                }
            }catch (Exception e){
                return false;
            }
        }

        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "()()(((())))))))";
        System.out.println(solve(s));
        String s2 = "()()()()";
        System.out.println(solve(s2));
        String s3 = ")()()()(";
        System.out.println(solve(s3));
        String s4 = ")";
        System.out.println(solve(s4));
        String s5 = "((()))";
        System.out.println(solve(s5));
    }
}
