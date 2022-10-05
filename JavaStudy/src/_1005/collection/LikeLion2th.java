package _1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentsObj = new ArrayList<>();
    public LikeLion2th(){
        Names names = new Names();
        this.students = names.getName();
        this.studentsObj = names.getStudentObjs();
    }

    public List<String> getStudentList(){
        return this.students;
    }
    public List<Student> getStudentListObj(){
        return this.studentsObj;
    }
}

