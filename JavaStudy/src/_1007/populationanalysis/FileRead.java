package _1007.populationanalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    private String filename;
    private MoveCount moveCount = new MoveCount();
    private int fromCnt;
    private int toCnt;

    File file;

    public FileRead(String filename) {
        this.filename = filename;
        this.file = new File(filename);
    }

    public void lineRead() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sLine = null;
        while ((sLine = br.readLine()) != null) {
            String tmp[] = sLine.split(",");
            moveCount.count(Integer.valueOf(tmp[6]), Integer.valueOf(tmp[0]));
        }
        moveCount.setMaxCount();
    }

    public void setCnt() {
        this.fromCnt = moveCount.getFromMaxIdx();
        this.toCnt = moveCount.getToMaxIdx();
    }

    public int getFromCnt() {
        return fromCnt;
    }

    public int getToCnt() {
        return toCnt;
    }
}
