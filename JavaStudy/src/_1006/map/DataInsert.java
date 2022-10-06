package _1006.map;

import java.util.HashMap;

public class DataInsert {
    private HashMap<String, String> students = new HashMap<String,String>();
    public HashMap<String,String> getStudent(){
        students.put("권하준", "https://github.com/dongyeon-0822/java-project-exercise");
        students.put("조성윤", "https://github.com/kang-subin/Java");
        students.put("안예은", "https://github.com/KoKwanwun/LikeLion.git");
        students.put("남우빈", "https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion");

        return this.students;
    }
}
