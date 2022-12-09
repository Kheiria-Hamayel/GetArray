package com.example.getarray.service.impl;

import com.example.getarray.model.Employee;
import com.example.getarray.repository.InMemoryEmployeeRepository;
import com.example.getarray.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Qualifier(value = "Inmemory")
public class InMemoryEmployeeServiceImpl implements EmployeeService {
private final InMemoryEmployeeRepository inMemoryEmployeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return inMemoryEmployeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return inMemoryEmployeeRepository.findEmployeeById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        inMemoryEmployeeRepository.updateEmployee(employee);

    }

    @Override
    public boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }

}
