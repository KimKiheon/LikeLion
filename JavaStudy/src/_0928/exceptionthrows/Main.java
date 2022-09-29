package _0928.exceptionthrows;

public class Main{
    public static void main(String[] args) {
        Main ma = new Main();
        try {
            ma.firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void firstMethod() throws Exception {
        secondMethod();
    }

    public void secondMethod() throws Exception {
        thirdMethod();
    }

    public void thirdMethod() throws Exception {
        System.out.println(10 / 0);
    }
    //third에서 예외 발생시 throws 구문으로 second로 넘기고 다시 first로 넘긴다
    //try까지 보내고 catch문에서 예외를 잡는다

}