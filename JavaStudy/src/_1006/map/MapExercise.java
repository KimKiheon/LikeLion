package _1006.map;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        MapStudentData mapStudentData = new MapStudentData();

        HashMap<String,String> hMap= mapStudentData.getStudent();


        Set<String> keys = hMap.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = hMap.get(key);
            System.out.println("이름: "+key+ " 깃 주소: "+value);
        }
    }
}
