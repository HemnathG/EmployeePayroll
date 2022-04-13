package com.bridgelabz;

public class EmployeePayroll {

    int employeeId;
    String employeeName;
    double employeeSalary;

    public EmployeePayroll (Integer employeeId, String employeeName, double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
