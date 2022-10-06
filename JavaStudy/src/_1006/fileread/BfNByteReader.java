package _1006.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BfNByteReader {
    private String filename;
    private int n;

    public BfNByteReader(String filename, int n) {
        this.filename = filename;
        this.n = n;
    }

    public void bufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename),
                16 * 1024);
        for (int i = 0; i < n; i++) System.out.println((char) br.read());
    }

}