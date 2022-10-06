package _1006.map;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        MapStudentData mapStudentData = new MapStudentData();

        HashMap<String,String> hMap= mapStudentData.getStudent();
        PrintMap printMap = new PrintMap(hMap);
        printMap.Print();
    }
}
