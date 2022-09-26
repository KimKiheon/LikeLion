package _0926.employee;

import _0926.employee.Employee;

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
