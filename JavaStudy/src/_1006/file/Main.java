package _1006.file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        bf1ByteReader bf1ByteReader = new bf1ByteReader("Hi.txt");
        //bf1ByteReader.bufferedReader();
        BfNByteReader bfNByteReader = new BfNByteReader("Hi.txt",3);
        bfNByteReader.bufferedReader();
    }

}
