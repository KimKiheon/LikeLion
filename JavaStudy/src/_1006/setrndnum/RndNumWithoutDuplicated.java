package _1006.setrndnum;

import java.util.HashSet;
import java.util.Set;

public class RndNumWithoutDuplicated {
    public static void main(String[] args) {
        RndNumberGenerator randomNumberGenerator = new RndNumberGenerator();
        Set<Integer> withoutDuplicate = new HashSet<>();
        for(int i=0;i<50;i++){
            int r = randomNumberGenerator.generate(10);
            withoutDuplicate.add(r);
            System.out.println(r);
        }
        System.out.println(withoutDuplicate);


    }
}
