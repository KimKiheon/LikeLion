package _1006.fileread;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file: files){
            System.out.println(file);
        }


        BfNByteReader bfNByteReader1 = new BfNByteReader("JavaStudy/src/_1006/textfile/hi.txt",1);
        System.out.println("1글자 읽기");
        bfNByteReader1.bufferedReader();

        BfNByteReader bfNByteReader2 = new BfNByteReader("Hi.txt",2);
        System.out.println("2글자 읽기");
        bfNByteReader2.bufferedReader();

        BfNByteReader bfNByteReader3 = new BfNByteReader("Hi.txt",3);
        System.out.println("N글자 읽기");
        bfNByteReader3.bufferedReader();
    }
/*
C:\Dev\jdk-11.0.15.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\lib\idea_rt.jar=61322:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Dev\LikeLion\out\production\LikeLion _1006.fileread.Main
.\.git
.\.gitignore
.\.idea
.\Hi.txt
.\JavaStudy
.\LikeLion.iml
.\out
.\README.md
1글자 읽기
H
2글자 읽기
H
e
N글자 읽기
H
e
l

 */
}
