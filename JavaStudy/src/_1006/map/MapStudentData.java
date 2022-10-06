package _1006.map;

import java.util.HashMap;

public class MapStudentData {

    private HashMap<String, String> students = new HashMap<String, String>();
    public MapStudentData(){
        DataInsert dataInsert = new DataInsert();
        this.students = dataInsert.getStudent();
    }
    public HashMap<String, String> getStudent(){
        return this.students;
    }

}
