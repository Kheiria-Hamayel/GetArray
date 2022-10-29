package com.example.getarray.service;

import com.example.getarray.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee findEmployeeById(Integer id);

    void updateEmployee(Employee employee);

    boolean deleteById(Integer id);
}
