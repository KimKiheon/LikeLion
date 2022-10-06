package _1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bf1ByteReader {
    private String filename;
    public bf1ByteReader(String filename) {
        this.filename=filename;
    }
    public void bufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename),
                16 * 1024);
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
    }

}
