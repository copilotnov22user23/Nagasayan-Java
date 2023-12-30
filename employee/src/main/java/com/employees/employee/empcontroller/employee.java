package com.employees.employee.empcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.employee.empRepo.Employee;
import com.employees.employee.empRepo.EmployeeRepo;

@RestController
public class employee {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/Employee")
    public List<Employee> getEmployees() {
        return employeeRepo.getEmployees();
    }
}
