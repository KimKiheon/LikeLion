package _0926.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager obj1 = new Manager(5000000);
        System.out.println("관리자의 월급:"+obj1.getSalary());
        Programmer obj2 = new Programmer(6000000);
        System.out.println("프로그래머의 월급:"+obj2.getSalary());
    }
}
