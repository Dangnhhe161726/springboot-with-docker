package com.springbootwithdocker.demo.service.impl;

import com.springbootwithdocker.demo.Repository.EmployeeRepository;
import com.springbootwithdocker.demo.model.Employee;
import com.springbootwithdocker.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmpoyees() {
        List<Employee> listEmployees = employeeRepository.findAll();
        return listEmployees;
    }

    @Override
    public Employee findById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }

    @Override
    public Employee deleteById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        employeeRepository.deleteById(id);
        return employee.get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
