package com.springboot.docker.service;

import com.springboot.docker.entity.Employee;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Optional<Employee> getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
