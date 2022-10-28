package Programmers.hash;

import java.util.Arrays;

public class PhoneNumberList {
    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book);
            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i + 1].substring(0,Math.min(phone_book[i].length(),phone_book[i+1].length())).contains(phone_book[i]))
                    //phone_book[i+1].startwish(phone_book[i])로 간단하게 가능!
                    return false;
            }
            return true;
        }
    }
}
