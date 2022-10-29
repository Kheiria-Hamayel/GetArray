package com.example.getarray.service.impl;

import com.example.getarray.model.Employee;
import com.example.getarray.repository.jpaRepositoryEmployee;
import com.example.getarray.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class jpaEmployeeServiceImpl implements EmployeeService {
    private final jpaRepositoryEmployee jpaRepositoryEmployee;
    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
