package _1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    public LikeLion2th(){
        Names names = new Names();
        students = names.getName();
    }

    public List<String> getStudentList(){
        return this.students;
    }
}

