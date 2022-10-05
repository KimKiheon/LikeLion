package _1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        //2기 학생의 이름이 들어있는 list를 return하는 method
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObj = likeLion2th.getStudentListObj();

        for(String student:students){
            System.out.println(student);
        }

        //for each문 자동완성 -> iter
        for (Student student : studentObj) {
            System.out.println(student);
        }
    }
}
