package com.employees.employee.empRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeRepo {
    
    // add 10 employees details to the list
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raj", "IT", 10000));
        employees.add(new Employee(2, "Ravi", "IT", 20000));
        employees.add(new Employee(3, "Raju", "IT", 30000));
        employees.add(new Employee(4, "Rajesh", "IT", 40000));
        employees.add(new Employee(5, "Rakesh", "IT", 50000));
        return employees;
    }
}







