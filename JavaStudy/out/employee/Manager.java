package _0926.employee;

import _0926.employee.Employee;

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
