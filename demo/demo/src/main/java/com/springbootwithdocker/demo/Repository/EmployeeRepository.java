package com.springbootwithdocker.demo.Repository;

import com.springbootwithdocker.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
