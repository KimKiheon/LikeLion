package _1007.populationanalysis;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileRead fileRead = new FileRead("C:\\Users\\admin\\Downloads\\2021.csv");
        fileRead.lineRead();
        fileRead.setCnt();

        NumberPrint numberPrint = new NumberPrint(fileRead.getFromCnt(), fileRead.getToCnt());
        numberPrint.print();


    }
}
