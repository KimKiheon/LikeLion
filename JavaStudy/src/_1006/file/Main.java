package _1006.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        bfReader bfReader = new bfReader("Hi.txt");
        bfReader.bufferedReader();
    }

}
