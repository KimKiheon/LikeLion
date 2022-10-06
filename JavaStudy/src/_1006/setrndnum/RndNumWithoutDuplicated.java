package _1006.setrndnum;

import java.util.HashSet;
import java.util.Set;

public class RndNumWithoutDuplicated {
    public static void main(String[] args) {
        RndNumberGenerator randomNumberGenerator = new RndNumberGenerator();
        Set<Integer> withoutDuplicate = new HashSet<>();
        Set<Character> withoutAlphabet = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            char c = (char)(randomNumberGenerator.generate(26)+65);
            withoutDuplicate.add(r);
            withoutAlphabet.add(c);
        }
        System.out.println(withoutDuplicate);
        System.out.println(withoutAlphabet);

    }
}
