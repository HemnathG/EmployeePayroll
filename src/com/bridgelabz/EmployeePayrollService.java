package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService(){
    }

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList){
        this.employeePayrollList = employeePayrollList;
    }

    private void readEmployeePayroll (Scanner scanner){
        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String employeeName = scanner.next();
        System.out.println("Enter Employee Salary:");
        double employeeSalary = scanner.nextDouble();

        employeePayrollList.add(new EmployeePayroll(employeeId, employeeName,employeeSalary));
    }

    private void writeEmployeePayroll (){
        System.out.println("Writing EmployeePayroll Data :" +employeePayrollList);
    }

    public static void main(String[] args) {

        ArrayList<EmployeePayroll> employeePayrollArrayList = new ArrayList<EmployeePayroll>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollArrayList);
        Scanner scanner = new Scanner(System.in);

        employeePayrollService.readEmployeePayroll(scanner);
        employeePayrollService.writeEmployeePayroll();
    }

}
