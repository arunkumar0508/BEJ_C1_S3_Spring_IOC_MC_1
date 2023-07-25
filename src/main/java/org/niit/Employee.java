package org.niit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Employee {

    int employeeId;
    String employeeName;
    Date employeeDCB;
    Department department;

    public Employee(){}

    public Employee(int employeeId, String employeeName,Date employeeDCB,Department department){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeDCB=employeeDCB;
        this.department=department;
    }
    @Autowired
    public Employee(Department department){
        this.department=department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeDCB() {
        return employeeDCB;
    }

    public void setEmployeeDCB(Date employeeDCB) {
        this.employeeDCB = employeeDCB;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDCB=" + employeeDCB +
                ", department=" + department +
                '}';
    }
}
