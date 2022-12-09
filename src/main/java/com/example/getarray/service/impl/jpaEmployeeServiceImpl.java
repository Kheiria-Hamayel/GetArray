package com.example.getarray.service.impl;

import com.example.getarray.model.Employee;
import com.example.getarray.repository.jpaRepositoryEmployee;
import com.example.getarray.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Qualifier(value = "employeeDB")
public class jpaEmployeeServiceImpl implements EmployeeService {
    private final jpaRepositoryEmployee jpaRepositoryEmployee;
    @Override
    public Employee addEmployee(Employee employee) {
        return jpaRepositoryEmployee.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return jpaRepositoryEmployee.findAll();
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return jpaRepositoryEmployee.findById(id).get();
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public boolean deleteById(Integer id) {
         jpaRepositoryEmployee.deleteById(id);
         return true;
    }
}
