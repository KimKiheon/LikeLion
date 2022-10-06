package _1006.fileread;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public char readAChar(String filename)throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

}
