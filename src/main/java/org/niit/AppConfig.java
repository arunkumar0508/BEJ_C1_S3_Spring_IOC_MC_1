package org.niit;

import org.springframework.context.annotation.Bean;

import java.util.Date;

public class AppConfig {

     @Bean
    public Employee getEmp(){
        Employee emp=new Employee(getDept());
        emp.setEmployeeId(100);
        emp.setEmployeeName("Manik Basha");
        emp.setEmployeeDCB(new Date(1997,8,5));
        return emp;
    }

    @Bean("dept")
    public Department getDept(){
        Department dept=new Department(100,"Production");
        return dept;
    }
}
