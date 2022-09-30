package _0930.GenericRetrospect;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("Hello");
        System.out.println(box.get());

        GenericBox<String, Integer> gbox = new GenericBox<>();
        gbox.set("Kiheon",26);
        System.out.println(gbox);
    }
}
