package _0926.employee;

public class Programmer extends Employee {
    private int salary;
    public Programmer(){}
    public Programmer(int salary){
        this.salary=salary;
    }

    @Override
    public int getSalary(){
        return salary;
    }
}
