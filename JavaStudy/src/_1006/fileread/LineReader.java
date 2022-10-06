package _1006.fileread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineReader {
    private String filename;
    public LineReader(String filename){
        this.filename=filename;
    }
    public void lineRead()  {
        try(BufferedReader br = Files.newBufferedReader
                (Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
