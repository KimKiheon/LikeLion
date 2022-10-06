package _1006.file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BfNByteReader bfNByteReader1 = new BfNByteReader("Hi.txt",1);
        System.out.println("1글자 읽기");
        bfNByteReader1.bufferedReader();

        BfNByteReader bfNByteReader2 = new BfNByteReader("Hi.txt",2);
        System.out.println("2글자 읽기");
        bfNByteReader2.bufferedReader();

        BfNByteReader bfNByteReader3 = new BfNByteReader("Hi.txt",3);
        System.out.println("N글자 읽기");
        bfNByteReader3.bufferedReader();
    }

}
