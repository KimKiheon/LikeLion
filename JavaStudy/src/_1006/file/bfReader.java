package _1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bfReader {
    private String filename;
    public void bufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename),
                16 * 1024);
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
    }

    public bfReader(String filename) throws FileNotFoundException {
        this.filename=filename;
    }

}
