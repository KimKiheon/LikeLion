package _1005.collection;

public class Student {
    private int classNumber;
    private String name;
    private String gitRepositoryAddress;
    public Student(int classNumber, String name, String gitRepositoryAddress){
        this.classNumber=classNumber;
        this.name=name;
        this.gitRepositoryAddress=gitRepositoryAddress;
    }

    public String toString(){
        return "classNumber: "+classNumber + " name: "+name+" git주소: "+gitRepositoryAddress;
    }
}
