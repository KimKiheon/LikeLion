package _1006.setrndnum;

public class RndNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
