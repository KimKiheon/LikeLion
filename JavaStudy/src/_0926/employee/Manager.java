package _0926.employee;

public class Manager extends Employee {
    private int salary;
    public Manager(){}
    public Manager(int salary){
        this.salary=salary;
    }

    @Override
    public int getSalary(){
        return salary;
    }

}
