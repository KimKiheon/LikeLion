package _1006.fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LineReader {
    private String filename;

    public LineReader(String filename) {
        this.filename = filename;
    }

    public void lineRead() throws IOException {
            BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
            System.out.println(br.readLine());

    }

    public void lineRead(int n) throws IOException {
        File file = new File(this.filename);
        List<String> fileContent = Files.readAllLines(file.toPath());
        for (int i = 0; i < n; i++) {
            System.out.println(fileContent.get(i));
        }
    }
}
