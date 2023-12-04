package com.springbootwithdocker.demo.service;

import com.springbootwithdocker.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmpoyees();

    Employee findById(long id);

    Employee deleteById(long id);

    Employee updateEmployee(Employee employee);
}
